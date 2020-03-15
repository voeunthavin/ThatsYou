package com.example.thatsyou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btn_start)
        var isRunning = false
        button.setOnClickListener {
            val textView: TextView = findViewById(R.id.txt_running_stop)
            if(!isRunning) {
                textView.text = "Service is running"
                button.text = "Stop"
                isRunning = true
            } else {
                textView.text = "Service is stop"
                button.text = "Start"
                isRunning = false
            }
        }
    }
}
