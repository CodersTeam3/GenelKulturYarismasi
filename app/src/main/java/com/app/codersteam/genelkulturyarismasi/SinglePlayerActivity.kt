package com.app.codersteam.genelkulturyarismasi

import android.app.Activity
import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_single_player.*

class SinglePlayerActivity : Activity() {

    var handler = Handler()
    var runnable = Runnable { }
    var skillUsed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_player)

        val window = window
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        runnable = object : Runnable{
            override fun run() {
                handler.postDelayed(runnable, 25)
                if(pb_time.progress < 100f)
                    pb_time.progress += 0.5f
                else {  //Sure bitti
                    handler.removeCallbacks(runnable)
                    Toast.makeText(applicationContext,"Bitti",Toast.LENGTH_SHORT).show()
                }
            }
        }
        runnable.run()
    }

    override fun onBackPressed() {
        handler.removeCallbacks(runnable)
        super.onBackPressed()
    }

    fun activitySpButtonPressed(it: View){
        when(it.id){
            btn_skill_half.id->{ //Yarı yarıya joker
                val avd: AnimatedVectorDrawable = getDrawable(R.drawable.avd_skill_half_cancel) as AnimatedVectorDrawable
                btn_skill_half.setImageDrawable(avd)
                btn_skill_half.isClickable = false
                skillUsed = true
                avd.start()
            }
            btn_skill_time.id->{ //Zaman doldurma joker
                pb_time.progress = 0f
                val avd: AnimatedVectorDrawable = getDrawable(R.drawable.avd_skill_time_cancel) as AnimatedVectorDrawable
                btn_skill_time.setImageDrawable(avd)
                btn_skill_time.isClickable = false
                skillUsed = true
                avd.start()
            }
            btn_skill_user.id->{ //Kullanıcı cevap oranı joker
                val avd: AnimatedVectorDrawable = getDrawable(R.drawable.avd_skill_user_cancel) as AnimatedVectorDrawable
                btn_skill_user.setImageDrawable(avd)
                btn_skill_user.isClickable = false
                skillUsed = true
                avd.start()
            }
            btn_answer1.id->{ //1.Cevap buttonu
                refreshAll()
            }
            btn_answer2.id->{ //2.Cevap buttonu
                refreshAll()
            }
            btn_answer3.id->{ //3.Cevap buttonu
                refreshAll()
            }
            btn_answer4.id->{ //4.Cevap buttonu
                refreshAll()
            }

        }
    }

    fun refreshAll(){
        if(skillUsed){
            if (!btn_skill_half.isClickable) {
                btn_skill_half.isClickable = true
                val avd: AnimatedVectorDrawable = getDrawable(R.drawable.avd_skill_half_open) as AnimatedVectorDrawable
                btn_skill_half.setImageDrawable(avd)
                avd.start()
            }
            if (!btn_skill_time.isClickable) {
                btn_skill_time.isClickable = true
                val avd: AnimatedVectorDrawable = getDrawable(R.drawable.avd_skill_time_open) as AnimatedVectorDrawable
                btn_skill_time.setImageDrawable(avd)
                avd.start()
            }
            if (!btn_skill_user.isClickable) {
                btn_skill_user.isClickable = true
                val avd: AnimatedVectorDrawable = getDrawable(R.drawable.avd_skill_user_open) as AnimatedVectorDrawable
                btn_skill_user.setImageDrawable(avd)
                avd.start()
            }
            skillUsed = false
        }
        pb_time.progress = 0F
    }
}
