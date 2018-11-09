package com.pedroabinajm.alsw.extension

import android.content.Context
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.view.ViewManager
import com.pedroabinajm.ankoslayoutshowroom.R
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

inline fun <reified LP : ViewGroup.LayoutParams> ViewManager.spacing(
    width: Int = matchParent,
    height: Int = matchParent
) = space {
    layoutParams<LP>(width.toDP(), height.toDP())
}

fun Context.attribute(value: Int) = TypedValue().apply {
    theme.resolveAttribute(value, this, true)
}

fun Context.attrAsDimen(value: Int): Int {
    return TypedValue.complexToDimensionPixelSize(attribute(value).data, resources.displayMetrics)
}

val Context.actionBarSize
    get() = attrAsDimen(R.attr.actionBarSize)