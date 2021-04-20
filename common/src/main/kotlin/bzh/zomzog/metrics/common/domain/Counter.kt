package bzh.zomzog.metrics.common.domain

interface Counter {
    fun increment()

    fun increment(times: Long)
}