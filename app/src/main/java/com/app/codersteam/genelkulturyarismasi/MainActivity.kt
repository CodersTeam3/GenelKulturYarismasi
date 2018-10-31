package com.app.codersteam.genelkulturyarismasi

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.squareup.picasso.Picasso

class MainActivity : Activity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var database: FirebaseDatabase
    private lateinit var myUserPropertiesRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Database ini
        database= FirebaseDatabase.getInstance()
        myUserPropertiesRef=database.getReference("Users")
        auth = FirebaseAuth.getInstance()
        if(auth.currentUser==null){
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }else {
            userproperties()
        }
    }
    fun userproperties(){
        myUserPropertiesRef.child(auth.uid).addValueEventListener(object : ValueEventListener{
            override fun onCancelled(p0: DatabaseError?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
            override fun onDataChange(p0: DataSnapshot?) {
                var userProperties = p0!!.child("properties")!!.getValue(UserProperties::class.java)
                //  var userProperties22:UserProperties = p0?.child("properties")?.value as UserProperties
                tv_coin.text = p0!!.child("coin").child("value").value.toString()
                tv_name.text = userProperties!!.personName
                Picasso.get().load(userProperties?.personPhoto).into(image)
            }

        })
    }
    fun buttonPressed(it:View){
        it as Button
        when(it.id){
            btn_singlePlayer.id-> {
                val intent = Intent(applicationContext,SinglePlayerActivity::class.java)
                startActivity(intent) }

            btn_multiPlayer.id-> {Intent(applicationContext,SinglePlayerActivity::class.java)
                startActivity(intent) }

            else->{
                Intent(applicationContext,SinglePlayerActivity::class.java)
                startActivity(intent) }

        }
    }

}