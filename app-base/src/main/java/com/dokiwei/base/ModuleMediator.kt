package com.dokiwei.base

import android.app.Application

/**
 * @author DokiWei
 * @date 2023/11/8 20:20
 */
object ModuleMediator {
    const val IS_RELEASE = true

    object ARouterConstants{
        private const val SETTING_MODULE = "/setting/"
        private const val MUSIC_MODULE = "/music/"
        private const val VIDEO_MODULE = "/video/"

        const val SETTING_ACTIVITY = SETTING_MODULE + "SettingActivity"
        const val MUSIC_ACTIVITY = MUSIC_MODULE + "MusicActivity"
        const val VIDEO_ACTIVITY = VIDEO_MODULE + "VideoActivity"
    }

    const val ACTIVITY_SETTING_CLASS = "com.dokiwei.setting.SettingActivity"
    const val ACTIVITY_MUSIC_CLASS = "com.dokiwei.music.MusicActivity"
    const val ACTIVITY_VIDEO_CLASS = "com.dokiwei.video.VideoActivity"

    private const val APP_SETTING_CLASS = "com.dokiwei.setting.App"
    private const val APP_MUSIC_CLASS = "com.dokiwei.music.App"
    private const val APP_VIDEO_CLASS = "com.dokiwei.video.App"

    interface AppInitial{
        fun init(app:Application)
    }
    fun init(app:Application){
        val appClasses = arrayOf(APP_SETTING_CLASS,APP_MUSIC_CLASS,APP_VIDEO_CLASS)
        appClasses.forEach {className->
            try {
                val clazz = Class.forName(className)
                val appInitial = clazz.getDeclaredConstructor().newInstance() as AppInitial
                appInitial.init(app)
            }catch (e:ClassNotFoundException){
                e.printStackTrace()
            }
        }
    }
}