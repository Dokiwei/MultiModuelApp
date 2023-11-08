package com.dokiwei.multimoduleapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.dokiwei.music.MusicActivity
import com.dokiwei.setting.SettingActivity
import com.dokiwei.video.VideoActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val musicButton = findViewById<Button>(R.id.btn_app_music)
        val videoButton = findViewById<Button>(R.id.btn_app_video)
        val settingButton = findViewById<Button>(R.id.btn_app_setting)
        musicButton.setOnClickListener(this)
        videoButton.setOnClickListener(this)
        settingButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_app_music -> {
                startActivity(Intent(this, MusicActivity::class.java))
            }

            R.id.btn_app_video -> {
                startActivity(Intent(this, VideoActivity::class.java))
            }

            R.id.btn_app_setting -> {
                startActivity(Intent(this, SettingActivity::class.java))
            }
        }
    }
}