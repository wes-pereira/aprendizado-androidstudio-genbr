package com.example.activities_intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class segundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        buttonVoltar.setOnClickListener {
            finish()
        }
    }
}