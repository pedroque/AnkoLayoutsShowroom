package com.pedroabinajm.constraintlayoutanko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.setContentView

class AnkoConstraintLayoutActivity : AppCompatActivity() {
    private val layout = AnkoConstraintLayout()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layout.setContentView(this)
    }
}
