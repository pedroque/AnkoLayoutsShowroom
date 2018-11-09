package com.pedroabinajm.alsw

import android.view.Gravity
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import com.pedroabinajm.alsw.extension.VIEW_PADDING
import com.pedroabinajm.alsw.extension.dp
import com.pedroabinajm.alsw.extension.layoutParams
import org.jetbrains.anko.*

class MainLayout : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        scrollView {
            layoutParams<ViewGroup.LayoutParams>(matchParent, matchParent)

            verticalLayout {
                gravity = Gravity.CENTER_HORIZONTAL
                padding = VIEW_PADDING.dp

                textView("Anko layout show room") {
                    textSize = 28F
                }.layoutParams<LinearLayout.LayoutParams>()
            }.layoutParams<FrameLayout.LayoutParams>(width = matchParent)
        }
    }
}