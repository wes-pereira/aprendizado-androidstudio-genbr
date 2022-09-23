package com.example.dice_roll

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.dice_roll.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_d6 = findViewById<Button>(R.id.button_d6)
        button_d6.setOnClickListener {
            //Toast.makeText(this, "Botão clicado", Toast.LENGTH_LONG).show()
            rolarDados6(6)
        }

        val button_d12 = findViewById<Button>(R.id.button_d12)
        button_d12.setOnClickListener {
            rolarDados12(12)
        }

        val button_d20 = findViewById<Button>(R.id.button_d20)
        button_d20.setOnClickListener {
            rolarDados20(20)
        }

    }

    private fun rolarDados6(lados: Int) {
        val rolagem = (1..lados).random()

        val text_dice = findViewById<TextView>(R.id.text_dice)

        text_dice.text = rolagem.toString()

    }


    private fun rolarDados12(lados: Int) {
        val rolagem = (1..lados).random()

        val text_dice = findViewById<TextView>(R.id.text_dice)

        text_dice.text = rolagem.toString()
    }


    private fun rolarDados20(lados: Int) {
        val rolagem = (1..lados).random()

        val text_dice = findViewById<TextView>(R.id.text_dice)

        text_dice.text = rolagem.toString()
    }
}