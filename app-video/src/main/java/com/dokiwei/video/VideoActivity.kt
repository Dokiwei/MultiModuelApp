package com.dokiwei.video

import android.os.Bundle
import com.dokiwei.base.BaseActivity
import com.dokiwei.base.ModuleMediator

class VideoActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.video_activity_video)
        //test intent to setting activity
        Thread {
            Thread.sleep(1500)
            startActivity(ModuleMediator.ACTIVITY_SETTING_CLASS)
        }.start()
    }
}