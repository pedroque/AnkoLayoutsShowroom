package com.pedroabinajm.coodinatorlayoutanko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.setContentView

class CoordinatorLayoutAnkoActivity : AppCompatActivity() {
    private val layout = CoordinatorLayoutAnkoLayout()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layout.setContentView(this)
        setSupportActionBar(layout.toolbar)
    }
}