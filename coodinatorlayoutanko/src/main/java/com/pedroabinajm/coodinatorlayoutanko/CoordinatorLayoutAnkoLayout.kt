package com.pedroabinajm.coodinatorlayoutanko

import android.support.design.widget.AppBarLayout
import android.support.design.widget.CollapsingToolbarLayout
import android.support.design.widget.CoordinatorLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.pedroabinajm.alsw.extension.VIEW_PADDING
import com.pedroabinajm.alsw.extension.actionBarSize
import com.pedroabinajm.alsw.extension.dp
import com.pedroabinajm.alsw.extension.layoutParams
import com.pedroabinajm.coodinatorlayoutanko.extension.exitUntilCollapsed
import com.pedroabinajm.coodinatorlayoutanko.extension.pin
import com.pedroabinajm.coodinatorlayoutanko.extension.scroll
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.collapsingToolbarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.floatingActionButton
import org.jetbrains.anko.dip
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.recyclerview.v7.recyclerView

class CoordinatorLayoutAnkoLayout : AnkoComponent<CoordinatorLayoutAnkoActivity> {
    lateinit var toolbar: Toolbar

    override fun createView(ui: AnkoContext<CoordinatorLayoutAnkoActivity>) = with(ui) {
        coordinatorLayout {
            layoutParams<ViewGroup.LayoutParams>(matchParent, matchParent)

            appBarLayout {
                layoutParams<CoordinatorLayout.LayoutParams>(height = dip(192), width = matchParent)
                id = R.id.coordinator_layout_anko_app_bar

                collapsingToolbarLayout {
                    layoutParams<AppBarLayout.LayoutParams>(matchParent, matchParent).apply {
                        scrollFlags = scroll or exitUntilCollapsed
                    }

                    toolbar = toolbar {
                        layoutParams<CollapsingToolbarLayout.LayoutParams>(
                            width = matchParent,
                            height = context.actionBarSize
                        ).apply {
                            collapseMode = pin
                        }
                    }
                }
            }

            recyclerView {
                layoutParams<CoordinatorLayout.LayoutParams>(matchParent, matchParent).apply {
                    behavior = AppBarLayout.ScrollingViewBehavior()
                }
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(ui.owner)
                adapter = Adapter()
            }

            floatingActionButton {
                layoutParams<CoordinatorLayout.LayoutParams>().apply {
                    anchorId = R.id.coordinator_layout_anko_app_bar
                    anchorGravity = Gravity.END or Gravity.BOTTOM
                    marginEnd = VIEW_PADDING.dp
                }
            }
        }
    }

    inner class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {
        private val items = listOf(
            "D.va",
            "Orisa",
            "Reinhardt",
            "Roadhog",
            "Winston",
            "Wrecking Ball",
            "Ana",
            "Brigitte",
            "Lucio",
            "Mercy",
            "Moira",
            "Zenyatta"
        )

        override fun onCreateViewHolder(parent: ViewGroup, position: Int) = with(LayoutInflater.from(parent.context)) {
            ViewHolder(inflate(android.R.layout.simple_list_item_1, parent, false))
        }

        override fun getItemCount() = items.size

        override fun onBindViewHolder(viewHolder: Adapter.ViewHolder, position: Int) = with(viewHolder) {
            textView.text = items[position]
        }

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val textView = view.findViewById<TextView>(android.R.id.text1)!!
        }
    }
}