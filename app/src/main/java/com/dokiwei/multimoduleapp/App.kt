package com.dokiwei.multimoduleapp

import android.app.Application
import com.dokiwei.base.ModuleMediator

/**
 * @author DokiWei
 * @date 2023/11/8 20:43
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        ModuleMediator.init(this)
    }
}