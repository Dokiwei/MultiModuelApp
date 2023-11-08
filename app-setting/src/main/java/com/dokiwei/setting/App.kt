package com.dokiwei.setting

import android.app.Application
import android.util.Log
import com.dokiwei.base.ModuleMediator

/**
 * @author DokiWei
 * @date 2023/11/8 20:43
 */
class App: ModuleMediator.AppInitial {
    override fun init(app: Application) {
        Log.d("com.dokiwei.setting.App", " init setting app ")
    }
}