package com.app.codersteam.genelkulturyarismasi

import android.app.Activity
import android.os.Bundle
import android.view.WindowManager

class SinglePlayerActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_player)

        val window = window
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
    }
}
