package com.example.virtualpet

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PetActivityPage : AppCompatActivity() {

    // Declaring the variables for the levels
    private var hungerLevel: Int = 10 // Initial hunger level
    private var cleanLevel: Int = 10 // Initial clean level
    private var playLevel: Int = 10// Initial play level

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pet_page)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Declaring the buttons and image view
        val imageView: ImageView = findViewById(R.id.imageView2)
        val btnFood: Button = findViewById(R.id.btnFood)
        val btnClean: Button = findViewById(R.id.btnClean)
        val btnPlay: Button = findViewById(R.id.btnPlay)
        // declaring the views for the texts
        val editTextHungerLevel: EditText = findViewById(R.id.editTextHungerLevel)
        val editTextCleanLevel: EditText = findViewById(R.id.editTextCleanLevel)
        val editTextPlayLevel: EditText = findViewById(R.id.editTextHappyLevel)

        // Set initial levels
        editTextHungerLevel.setText(hungerLevel.toString())
        editTextCleanLevel.setText(cleanLevel.toString())
        editTextPlayLevel.setText(playLevel.toString())

        // will reduce the levels
        btnFood.setOnClickListener {
            imageView.setImageResource(R.drawable.pluto_eating)
            if (hungerLevel > 0) {
                hungerLevel -= 1
                editTextHungerLevel.setText(hungerLevel.toString())
            }
        }
        // will reduce the levels
        btnClean.setOnClickListener {
            imageView.setImageResource(R.drawable.pluto_showering)
            if (cleanLevel > 0) {
                cleanLevel -= 1
                editTextHungerLevel.setText(cleanLevel.toString())
            }
        }
        // will reduce the levels
        btnClean.setOnClickListener {
            imageView.setImageResource(R.drawable.pluto_playing)
            if (playLevel > 0) {
                playLevel -= 1
                editTextHungerLevel.setText(playLevel.toString())
            }
        }

        // when the user clicks on the Food button a picture of the dog Eating will show
        btnFood.setOnClickListener {
            imageView.setImageResource(R.drawable.pluto_eating)
        }
        // when the user clicks on the Clean button a picture of the dog taking a shower will show
        btnClean.setOnClickListener {
            imageView.setImageResource(R.drawable.pluto_showering)
        }
        // when the user clicks on the play button a picture of the dog playing will show
        btnPlay.setOnClickListener {
            imageView.setImageResource(R.drawable.pluto_playing)
        }
    }
}
