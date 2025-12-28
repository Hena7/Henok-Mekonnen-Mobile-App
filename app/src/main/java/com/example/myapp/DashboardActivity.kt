package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Get references to all cards
        val cardBanking = findViewById<CardView>(R.id.card_banking)
        val cardIdeas = findViewById<CardView>(R.id.card_ideas)
        val cardAid = findViewById<CardView>(R.id.card_aid)
        val cardLinks = findViewById<CardView>(R.id.card_links)
        val cardAdd = findViewById<CardView>(R.id.card_add)

        // Banking Card Click
        cardBanking.setOnClickListener {
            val intent = Intent(this, BankingActivity::class.java)
            startActivity(intent)
        }

        // Ideas Card Click
        cardIdeas.setOnClickListener {
            val intent = Intent(this, IdeasActivity::class.java)
            startActivity(intent)
        }

        // Aid Card Click
        cardAid.setOnClickListener {
            val intent = Intent(this, AidActivity::class.java)
            startActivity(intent)
        }

        // Links Card Click
        cardLinks.setOnClickListener {
            val intent = Intent(this, LinksActivity::class.java)
            startActivity(intent)
        }

        // Add Activity Card Click
        cardAdd.setOnClickListener {
            val intent = Intent(this, AddActivityPage::class.java)
            startActivity(intent)
        }
    }
}