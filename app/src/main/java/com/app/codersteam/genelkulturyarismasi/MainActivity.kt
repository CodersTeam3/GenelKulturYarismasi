package com.app.codersteam.genelkulturyarismasi

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
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

    fun buttonPressed(it:View){
        it as Button
        when(it.id){
            singlePlayerButton.id-> {
                var intent = Intent(applicationContext,SinglePlayerActivity::class.java)
                startActivity(intent) }

            multiPlayerButton.id-> {Intent(applicationContext,SinglePlayerActivity::class.java)
                startActivity(intent) }

            else->{
                Intent(applicationContext,SinglePlayerActivity::class.java)
                startActivity(intent) }

        }
    }

}