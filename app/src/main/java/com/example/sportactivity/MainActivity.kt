package com.example.sportactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sportactivity.databinding.ActivityMainBinding
import com.example.sportactivity.databinding.ActivityStepsBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

    }
    fun onClickStepsActivity(view: View){
        val intent = Intent(this, StepsActivity::class.java)
        startActivity(intent)
    }
}