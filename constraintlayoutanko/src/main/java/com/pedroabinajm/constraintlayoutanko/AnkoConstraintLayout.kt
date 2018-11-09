package com.pedroabinajm.constraintlayoutanko

import android.graphics.Color
import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet.PARENT_ID
import android.view.Gravity
import android.view.ViewGroup
import com.pedroabinajm.alsw.extension.VIEW_PADDING
import com.pedroabinajm.alsw.extension.dp
import com.pedroabinajm.alsw.extension.layoutParams
import org.jetbrains.anko.*
import org.jetbrains.anko.constraint.layout.ConstraintSetBuilder.Side.*
import org.jetbrains.anko.constraint.layout.applyConstraintSet
import org.jetbrains.anko.constraint.layout.constraintLayout

class AnkoConstraintLayout : AnkoComponent<AnkoConstraintLayoutActivity> {
    override fun createView(ui: AnkoContext<AnkoConstraintLayoutActivity>) = with(ui) {
        constraintLayout {
            layoutParams<ViewGroup.LayoutParams>(matchParent, matchParent)
            backgroundColor = Color.WHITE

            textView("Anko Constraint layout") {
                id = R.id.constraint_layout_anko_title
                textSize = 28F
                backgroundColor = Color.GREEN
                textColor = Color.WHITE
            }.layoutParams<ConstraintLayout.LayoutParams>()

            textView("Left block") {
                id = R.id.constraint_layout_anko_left
                textSize = 18F
                backgroundColor = Color.RED
                textColor = Color.WHITE
                gravity = Gravity.CENTER
            }.layoutParams<ConstraintLayout.LayoutParams>(height = dip(200), width = 0)

            textView("Right block") {
                id = R.id.constraint_layout_anko_right
                textSize = 18F
                backgroundColor = Color.BLUE
                textColor = Color.WHITE
                gravity = Gravity.CENTER
            }.layoutParams<ConstraintLayout.LayoutParams>(height = dip(200), width = 0)

            applyConstraintSet {
                R.id.constraint_layout_anko_title {
                    connect(
                        START to START of PARENT_ID margin VIEW_PADDING.dp,
                        END to END of PARENT_ID margin VIEW_PADDING.dp,
                        TOP to TOP of PARENT_ID margin VIEW_PADDING.dp
                    )
                }

                R.id.constraint_layout_anko_right {
                    connect(
                        START to END of R.id.constraint_layout_anko_left,
                        END to END of PARENT_ID,
                        TOP to BOTTOM of R.id.constraint_layout_anko_title
                    )
                }

                R.id.constraint_layout_anko_left {
                    connect(
                        START to START of PARENT_ID,
                        END to START of R.id.constraint_layout_anko_right,
                        TOP to BOTTOM of R.id.constraint_layout_anko_title
                    )
                }
            }
        }
    }
}