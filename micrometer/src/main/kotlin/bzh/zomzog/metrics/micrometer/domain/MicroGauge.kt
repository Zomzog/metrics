package bzh.zomzog.metrics.micrometer.domain

import bzh.zomzog.metrics.common.domain.Gauge
import java.util.concurrent.atomic.AtomicLong

class MicroGauge(private val gauge: AtomicLong) : Gauge {
    override fun increment() {
        gauge.incrementAndGet()
    }

    override fun increment(times: Long) {
        gauge.addAndGet(times)
    }

    override fun decrement() {
        gauge.decrementAndGet()
    }

    override fun decrement(times: Long) {
        gauge.addAndGet(-times)
    }

    override fun set(value: Long) {
        gauge.set(value)
    }
}