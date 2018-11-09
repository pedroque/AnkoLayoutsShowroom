package com.pedroabinajm.alsw.extension

import android.view.View
import android.view.ViewGroup
import android.view.ViewManager
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.space
import org.jetbrains.anko.wrapContent

inline fun <reified LP : ViewGroup.LayoutParams> View.layoutParams(
    width: Int = wrapContent,
    height: Int = wrapContent
): LP = LP::class.java.getConstructor(Int::class.java, Int::class.java)
    .newInstance(width, height)
    .apply {
        layoutParams = this
    }

inline fun <reified LP : ViewGroup.LayoutParams> ViewManager.space(
    width: Int = matchParent,
    height: Int = matchParent
) = space {
    layoutParams<LP>(width.toDP(), height.toDP())
}
