package bzh.zomzog.metrics.micrometer.domain

import bzh.zomzog.metrics.common.domain.Counter

class MicroCounter(private val counter: io.micrometer.core.instrument.Counter) : Counter {
    override fun increment() {
        counter.increment()
    }

    override fun increment(times: Long) {
        counter.increment(times.toDouble())
    }
}