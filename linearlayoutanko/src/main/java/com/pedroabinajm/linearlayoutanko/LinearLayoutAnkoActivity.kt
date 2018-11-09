package com.pedroabinajm.linearlayoutanko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.setContentView

class LinearLayoutAnkoActivity : AppCompatActivity() {
    private val layout = LinearLayoutAnkoLayout()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layout.setContentView(this)
    }
}