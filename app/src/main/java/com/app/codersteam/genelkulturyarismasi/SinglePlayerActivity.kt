package com.app.codersteam.genelkulturyarismasi

import android.app.Activity
import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_single_player.*

class SinglePlayerActivity : Activity() {

    var skillUsed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_player)

        val window = window
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
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
                if(skillUsed)
                    refreshSkill()
            }
            btn_answer2.id->{ //2.Cevap buttonu
                if(skillUsed)
                    refreshSkill()
            }
            btn_answer3.id->{ //3.Cevap buttonu
                if(skillUsed)
                    refreshSkill()
            }
            btn_answer4.id->{ //4.Cevap buttonu
                if(skillUsed)
                    refreshSkill()
            }

        }
    }

    fun refreshSkill(){
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
}
