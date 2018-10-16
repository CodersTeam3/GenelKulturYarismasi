package com.app.codersteam.genelkulturyarismasi

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth

class MainActivity : Activity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()
        if(auth.currentUser==null){
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
