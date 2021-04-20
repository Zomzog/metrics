package bzh.zomzog.metrics.micrometer

import io.micrometer.core.instrument.MeterRegistry as MicroMeterRegistry
import bzh.zomzog.metrics.common.MeterRegistry
import bzh.zomzog.metrics.common.domain.Counter
import bzh.zomzog.metrics.common.domain.Gauge
import bzh.zomzog.metrics.micrometer.domain.MicroCounter
import bzh.zomzog.metrics.micrometer.domain.MicroGauge
import io.micrometer.core.instrument.Tag
import java.util.concurrent.atomic.AtomicLong

class MicrometerMeterRegistry(private val meterRegistry: MicroMeterRegistry): MeterRegistry {
    override fun gauge(name: String, tags: Map<String, String>): Gauge = MicroGauge(meterRegistry.gauge(name, tags.asTags(), AtomicLong(0)))

    override fun counter(name: String, tags: Map<String, String>): Counter = MicroCounter(meterRegistry.counter(name, tags.asTags()))

    fun Map<String, String>.asTags() = this.map { Tag.of(it.key, it.value) }
}