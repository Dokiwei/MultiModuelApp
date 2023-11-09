package com.dokiwei.music

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.dokiwei.base.BaseActivity
import com.dokiwei.base.ModuleMediator

@Route(path = ModuleMediator.ARouterConstants.MUSIC_ACTIVITY)
class MusicActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.music_activity_music)
        Handler(Looper.getMainLooper()).postDelayed({
            ARouter.getInstance().build(ModuleMediator.ARouterConstants.SETTING_ACTIVITY)
                .navigation()
        }, 1000)
    }
}