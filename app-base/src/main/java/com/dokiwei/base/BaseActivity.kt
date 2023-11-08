package com.dokiwei.base

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * @author DokiWei
 * @date 2023/11/8 20:19
 */

open class BaseActivity : AppCompatActivity() {
    protected fun startActivity(className: String, bundle: Bundle? = null) {
        try {
            val clazz = Class.forName(className)
            val intent = Intent(this,clazz)
            if (bundle!=null)
                intent.putExtras(bundle)
            startActivity(intent)
        }catch (e:ClassNotFoundException){
            e.printStackTrace()
            Toast.makeText(this,"未找到$className\n\t${e.message}", Toast.LENGTH_LONG).show()
        }
    }
}