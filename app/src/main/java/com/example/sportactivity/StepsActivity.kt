package com.example.sportactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sportactivity.databinding.ActivityMainBinding
import com.example.sportactivity.databinding.ActivityStepsBinding

class StepsActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityStepsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityStepsBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

    }
fun onClickBrowserActivity(view: View){
    val intent = Intent(this, BrowserActivity::class.java)
    startActivity(intent)
}
}