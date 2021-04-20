package bzh.zomzog.metrics.common.domain

interface Gauge {

    fun increment()

    fun increment(times: Long)

    fun decrement()

    fun decrement(times: Long)

    fun set(value: Long)
}