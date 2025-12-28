package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class IdeasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ideas)

        supportActionBar?.title = "Ideas"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
