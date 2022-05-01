package com.example.sportactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.sportactivity.databinding.ActivityBrowserBinding

class BrowserActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityBrowserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityBrowserBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val myWebView = bindingClass.wbView as WebView
        myWebView.loadUrl("https://developer.android.com")

    }
}