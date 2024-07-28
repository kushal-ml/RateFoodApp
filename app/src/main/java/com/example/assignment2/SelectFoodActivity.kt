package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.widget.Toolbar

class SelectFoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_food)

        val toolbar_select = findViewById<Toolbar>(R.id.toolbar_select)
        setSupportActionBar(toolbar_select)


        val spinner = findViewById<Spinner>(R.id.spinner_food)
        val adapter = ArrayAdapter.createFromResource(this, R.array.food_items, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        findViewById<View>(R.id.btn_submit).setOnClickListener {
            // Clear form fields
            findViewById<EditText>(R.id.et_name).setText("")
            findViewById<EditText>(R.id.et_phone_number).setText("")
            spinner.setSelection(0)
        }
    }

    override fun onCreateOptionsMenu(menu: android.view.Menu): Boolean {
        menuInflater.inflate(R.menu.menu_select_food, menu)
        return true
    }

    override fun onOptionsItemSelected(item: android.view.MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_home -> startActivity(Intent(this, MainActivity::class.java))
            R.id.menu_rate_food -> startActivity(Intent(this, RateFoodActivity::class.java))
        }
        return true
    }
}