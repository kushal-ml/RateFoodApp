package com.example.assignment2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        findViewById<View>(R.id.btn_select_food).setOnClickListener {
            startActivity(Intent(this, SelectFoodActivity::class.java))
        }

        findViewById<View>(R.id.btn_rate_food).setOnClickListener {
            startActivity(Intent(this, RateFoodActivity::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.menu_select_food -> startActivity(Intent(this, SelectFoodActivity::class.java))
            R.id.menu_rate_food -> startActivity(Intent(this, RateFoodActivity::class.java))

        }
        return super.onOptionsItemSelected(item)
    }
}