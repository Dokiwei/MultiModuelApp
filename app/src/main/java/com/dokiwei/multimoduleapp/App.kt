package com.dokiwei.multimoduleapp

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.dokiwei.base.ModuleMediator

/**
 * @author DokiWei
 * @date 2023/11/8 20:43
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        if (!ModuleMediator.IS_RELEASE){
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
        ModuleMediator.init(this)
    }
}