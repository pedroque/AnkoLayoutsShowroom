package com.pedroabinajm.alsw

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.pedroabinajm.alsw.extension.launchDynamicActivity
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {
    private val layout = MainLayout()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layout.apply {
            onAnkoLinearLayoutClick = {
                launchDynamicActivity("linearlayout-anko")
            }
        }.setContentView(this)
    }
}