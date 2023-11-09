package com.dokiwei.setting

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.dokiwei.base.BaseActivity
import com.dokiwei.base.ModuleMediator

@Route(path = ModuleMediator.ARouterConstants.SETTING_ACTIVITY)
class SettingActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.setting_activity_setting)
    }
}