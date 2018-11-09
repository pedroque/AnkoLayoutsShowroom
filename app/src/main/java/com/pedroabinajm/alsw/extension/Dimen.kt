package com.pedroabinajm.alsw.extension

import android.content.res.Resources
import android.util.TypedValue
import android.view.ViewGroup

const val VIEW_PADDING = 16

val Int.dp: Int
    get() = toFloat().dp.toInt()
val Float.dp: Float
    get() = applyDimension(Resources.getSystem(), TypedValue.COMPLEX_UNIT_DIP)

private fun Float.applyDimension(resources: Resources, typedValue: Int) = TypedValue.applyDimension(
    typedValue,
    this,
    resources.displayMetrics
)

fun Int.toDP() = when (this) {
    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT -> this
    else -> dp
}
