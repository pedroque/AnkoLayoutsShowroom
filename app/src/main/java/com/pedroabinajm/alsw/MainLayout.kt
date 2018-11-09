package com.pedroabinajm.alsw

import android.view.Gravity
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import com.pedroabinajm.alsw.extension.VIEW_PADDING
import com.pedroabinajm.alsw.extension.dp
import com.pedroabinajm.alsw.extension.layoutParams
import com.pedroabinajm.alsw.extension.spacing
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.button
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.padding
import org.jetbrains.anko.scrollView
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

class MainLayout : AnkoComponent<MainActivity> {
    var onAnkoLinearLayoutClick: () -> Unit = {}
    var onXMLLinearLayoutClick: () -> Unit = {}
    var onAnkoConstraintLayoutClick: () -> Unit = {}
    var onXMLConstraintLayoutClick: () -> Unit = {}
    var onXMLCoordinatorLayoutClick: () -> Unit = {}

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        scrollView {
            layoutParams<ViewGroup.LayoutParams>(matchParent, matchParent)

            verticalLayout {
                gravity = Gravity.CENTER_HORIZONTAL
                padding = VIEW_PADDING.dp

                textView("Anko layout show room") {
                    textSize = 28F
                }.layoutParams<LinearLayout.LayoutParams>()

                spacing<LinearLayout.LayoutParams>(height = VIEW_PADDING)

                button("Linear Layout - anko").setOnClickListener {
                    onAnkoLinearLayoutClick()
                }

                spacing<LinearLayout.LayoutParams>(height = VIEW_PADDING)

                button("Linear Layout - XML").setOnClickListener {
                    onXMLLinearLayoutClick()
                }

                spacing<LinearLayout.LayoutParams>(height = VIEW_PADDING)

                button("Constraint Layout - anko").setOnClickListener {
                    onAnkoConstraintLayoutClick()
                }

                spacing<LinearLayout.LayoutParams>(height = VIEW_PADDING)

                button("Constraint Layout - XML").setOnClickListener {
                    onXMLConstraintLayoutClick()
                }

                spacing<LinearLayout.LayoutParams>(height = VIEW_PADDING)

                button("Coordinator Layout - XML").setOnClickListener {
                    onXMLCoordinatorLayoutClick()
                }
            }.layoutParams<FrameLayout.LayoutParams>(width = matchParent)
        }
    }
}