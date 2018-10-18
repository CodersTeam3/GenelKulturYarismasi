package com.app.codersteam.genelkulturyarismasi

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import com.google.firebase.auth.FirebaseAuth

class MainActivity : Activity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hello World")
        button.setOnClickListener(View.OnClickListener {
            var intent = Intent(applicationContext,SinglePlayerActivity::class.java)
            startActivity(intent)
        })
        auth = FirebaseAuth.getInstance()
        if(auth.currentUser==null){
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}