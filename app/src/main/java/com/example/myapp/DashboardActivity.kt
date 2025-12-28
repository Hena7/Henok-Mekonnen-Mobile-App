package com.example.myapp



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val tvWelcome = findViewById<TextView>(R.id.tv_welcome)
        val username = intent.getStringExtra("USERNAME")

        tvWelcome.text = "Welcome, $username!"
    }
}