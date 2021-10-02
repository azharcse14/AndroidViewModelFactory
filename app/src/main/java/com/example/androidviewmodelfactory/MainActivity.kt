package com.example.androidviewmodelfactory

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var mainViewModel:MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textCounter)

        mainViewModel = ViewModelProvider(this, MainViewModelFactory(3)).get(MainViewModel::class.java)
    }

    fun increment(view: android.view.View) {

        mainViewModel.increment()
        textView.text = mainViewModel.count.toString()

    }
}