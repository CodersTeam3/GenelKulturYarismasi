package com.app.codersteam.genelkulturyarismasi

import android.app.Activity
import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_single_player.*

class SinglePlayerActivity : Activity() {

    var flag:Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_player)

        val window = window
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

    }

    fun activitySpButtonPressed(it: View){
        when(it.id){
            btn_skill_half.id->{
                val avd: AnimatedVectorDrawable = getDrawable(R.drawable.avd_skill_half_cancel) as AnimatedVectorDrawable
                btn_skill_half.setImageDrawable(avd)
                btn_skill_half.isClickable = false
                avd.start()
            }
            btn_skill_time.id->{
                val avd: AnimatedVectorDrawable = getDrawable(R.drawable.avd_skill_time_cancel) as AnimatedVectorDrawable
                btn_skill_time.setImageDrawable(avd)
                btn_skill_time.isClickable = false
                avd.start()
            }
            btn_skill_user.id->{
                val avd: AnimatedVectorDrawable = getDrawable(R.drawable.avd_skill_user_cancel) as AnimatedVectorDrawable
                btn_skill_user.setImageDrawable(avd)
                btn_skill_user.isClickable = false
                avd.start()
            }
        }
    }
}
