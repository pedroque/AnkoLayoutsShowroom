package com.pedroabinajm.coordinatorlayoutxml

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_coordinator_layout.*

class CoordinatorLayoutXMLActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coordinator_layout)
        setSupportActionBar(coordinator_layout_xml_toolbar)
        coordinator_layout_xml_recycler.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@CoordinatorLayoutXMLActivity)
            adapter = Adapter()
        }
    }

    inner class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {
        private val items = listOf(
            "McCree",
            "Ashe",
            "Widowmaker",
            "Soldier: 76",
            "Tracer",
            "Torbjorn",
            "Symmetra",
            "Sombra",
            "Reaper",
            "Doomfist",
            "Bastion",
            "Genji",
            "Hanzo",
            "Junrat",
            "Mei",
            "Pharah"
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
