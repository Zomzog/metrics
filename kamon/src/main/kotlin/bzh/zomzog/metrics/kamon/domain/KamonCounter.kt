package bzh.zomzog.metrics.kamon.domain

import bzh.zomzog.metrics.common.domain.Counter

class KamonCounter(private val counter: kamon.metric.Counter) : Counter {
    override fun increment() {
        counter.increment()
    }

    override fun increment(times: Long) {
        counter.increment(times)
    }
}