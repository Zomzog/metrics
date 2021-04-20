package bzh.zomzog.metrics.common

import bzh.zomzog.metrics.common.domain.Counter
import bzh.zomzog.metrics.common.domain.Gauge

interface MeterRegistry {

    fun gauge(name: String, tags: Map<String, String> = emptyMap()): Gauge

    fun counter(name: String, tags: Map<String, String> = emptyMap()): Counter
}