package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        val submitButton = findViewById<Button>(R.id.submitButton)
        submitButton.setOnClickListener {
            checkAnswer()
        }
    }

    private fun checkAnswer() {
        val firstAnswer = findViewById<EditText>(R.id.editText)
        val secondAnswer = findViewById<EditText>(R.id.editText2)
        val thirdAnswer = findViewById<EditText>(R.id.editText3)
        val fourthAnswer = findViewById<EditText>(R.id.editText4)

        val firstAnswerText = firstAnswer.text.toString()
        val secondAnswerText = secondAnswer.text.toString()
        val thirdAnswerText = thirdAnswer.text.toString()
        val fourthAnswerText = fourthAnswer.text.toString()

        // Checks if the editText isn't empty
        if (firstAnswer.length() > 0 && secondAnswer.length() > 0 && thirdAnswer.length() > 0 && fourthAnswer.length() > 0) {

            // Checks if the editText has the correct answer
            if (firstAnswerText == "T" && secondAnswerText == "F" && thirdAnswerText == "F" && fourthAnswerText == "F") {
                Toast.makeText(this, R.string.correct, Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, R.string.incorrect, Toast.LENGTH_LONG).show()
            }
        } else {
            Toast.makeText(this, R.string.blank, Toast.LENGTH_LONG).show()
        }
    }


}
