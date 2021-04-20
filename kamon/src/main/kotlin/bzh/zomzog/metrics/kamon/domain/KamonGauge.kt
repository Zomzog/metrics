package bzh.zomzog.metrics.kamon.domain

import bzh.zomzog.metrics.common.domain.Gauge

class KamonGauge(private val gauge: kamon.metric.Gauge) : Gauge {
    override fun increment() {
        gauge.increment()
    }

    override fun increment(times: Long) {
        gauge.increment(times)
    }

    override fun decrement() {
        gauge.decrement()
    }

    override fun decrement(times: Long) {
        gauge.decrement(times)
    }

    override fun set(value: Long) {
        gauge.set(value)
    }
}