package bzh.zomzog.metrics.kamon

import bzh.zomzog.metrics.common.MeterRegistry
import bzh.zomzog.metrics.common.domain.Counter
import bzh.zomzog.metrics.common.domain.Gauge
import bzh.zomzog.metrics.kamon.domain.KamonCounter
import bzh.zomzog.metrics.kamon.domain.KamonGauge
import kamon.Kamon

class KamonMeterRegistry : MeterRegistry {
    override fun gauge(name: String, tags: Map<String, String>): Gauge =
        KamonGauge(
            Kamon.gauge(name)
                .refine(tags)
        )

    override fun counter(name: String, tags: Map<String, String>): Counter =
        KamonCounter(
            Kamon.counter(name)
                .refine(tags)
        )

}