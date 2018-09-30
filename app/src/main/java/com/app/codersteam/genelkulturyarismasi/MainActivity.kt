package com.app.codersteam.genelkulturyarismasi

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(View.OnClickListener { it: View ->
            var intent = Intent(applicationContext,SinglePlayerActivity::class.java)
            startActivity(intent)
        })
    }
}