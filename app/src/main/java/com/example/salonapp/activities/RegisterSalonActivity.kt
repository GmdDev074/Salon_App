package com.example.salonapp.activities


import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.salonapp.R

class RegisterSalonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_salon)

        /*// Back button click listener
        findViewById<ImageButton>(R.id.back_button).setOnClickListener {
            finish()
        }

        // Services dropdown
        val servicesOptions = arrayOf("Male", "Female", "Combined")
        val servicesAdapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, servicesOptions)
        services_input.setAdapter(servicesAdapter)

        // Gender dropdown
        val genderOptions = arrayOf("Male", "Female", "Other")
        val genderAdapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, genderOptions)
        gender_input.setAdapter(genderAdapter)

        // Pick location button click listener
        pick_location_button.setOnClickListener {
            // Placeholder for launching Google Maps location picker
            // You'll need to implement this using Google Maps API
            // For example, launch an intent to pick a location and handle the result
        }

        // Register salon button click listener
        register_salon_button.setOnClickListener {
            // Validate and collect input data
            // Perform registration (e.g., API call)
            // Navigate to the next screen or show a success message
        }*/
    }
}