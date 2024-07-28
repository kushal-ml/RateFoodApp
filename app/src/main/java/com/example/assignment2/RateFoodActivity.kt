package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar

class RateFoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rate_food)
        
        val toolbar = findViewById<Toolbar>(R.id.toolbar_rate)
        setSupportActionBar(toolbar)

        findViewById<View>(R.id.btn_rate_food).setOnClickListener {
            val dialogFragment = RateFoodDialogFragment()
            dialogFragment.show(supportFragmentManager, "RateFoodDialogFragment")
        }
    }

    override fun onCreateOptionsMenu(menu: android.view.Menu): Boolean {
        menuInflater.inflate(R.menu.menu_rate_food, menu)
        return true
    }

    override fun onOptionsItemSelected(item: android.view.MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_home -> startActivity(Intent(this, MainActivity::class.java))
            R.id.menu_select_food -> startActivity(Intent(this, SelectFoodActivity::class.java))
        }
        return true
    }
}