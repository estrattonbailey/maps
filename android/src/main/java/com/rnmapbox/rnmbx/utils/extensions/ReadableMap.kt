package com.rnmapbox.rnmbx.utils.extensions

import com.facebook.react.bridge.ReadableMap

fun ReadableMap.forEach(action: (String, Any) -> Unit) {
    val iterator = this.entryIterator
    while (iterator.hasNext()) {
        val next = iterator.next()
        action(next.key, next.value)
    }
}
