package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonskills = findViewById<Button>(R.id.btnSkills)
        buttonskills.setOnClickListener {
            intent = Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }
        val buttonEducation = findViewById<Button>(R.id.btnEducation)
        buttonEducation.setOnClickListener {
            intent = Intent(this,EducationActivity::class.java)
            startActivity(intent)
        }
        val buttonWork = findViewById<Button>(R.id.btnWork)
        buttonWork.setOnClickListener {
            intent = Intent(this,WorkActivity::class.java)
            startActivity(intent)
        }
        val buttonAchivements = findViewById<Button>(R.id.btnAchivements)
        buttonAchivements.setOnClickListener {
            intent = Intent(this,AchivementsAcitivity::class.java)
            startActivity(intent)
        }

    }
}