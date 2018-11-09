package com.pedroabinajm.linearlayoutanko

import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import com.pedroabinajm.alsw.extension.VIEW_PADDING
import com.pedroabinajm.alsw.extension.dp
import com.pedroabinajm.alsw.extension.layoutParams
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.padding
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

class LinearLayoutAnkoLayout : AnkoComponent<LinearLayoutAnkoActivity> {
    override fun createView(ui: AnkoContext<LinearLayoutAnkoActivity>) = with(ui) {
        verticalLayout {
            layoutParams<ViewGroup.LayoutParams>(matchParent, matchParent)
            gravity = Gravity.CENTER_HORIZONTAL
            padding = VIEW_PADDING.dp

            textView("Anko Linear Layout") {
                textSize = 28F
            }.layoutParams<LinearLayout.LayoutParams>()
        }
    }
}
