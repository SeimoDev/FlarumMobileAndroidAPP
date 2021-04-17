package com.flarum.flarum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import kotlinx.android.synthetic.main.activity_web.*

private var WebSettings.JavaScriptEnabled: Unit
    get() = Unit
    set(value) {}


class web : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        login.loadUrl("https://sakura-bbs.cn/login")
    }
}