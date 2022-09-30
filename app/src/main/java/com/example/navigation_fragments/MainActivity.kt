package com.example.navigation_fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomNavigation = findViewById<BottomNavigationView>(R.id.nav_bar)
        val navController = Navigation.findNavController(this,R.id.host_fragment)
        NavigationUI.setupWithNavController(bottomNavigation,navController)


        val buttonClick =findViewById<Button>(R.id.Btn_fav)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Favourite::class.java)
            startActivity(intent)
            finish()
        }

        val buttonClick2 =findViewById<Button>(R.id.Btn_favo)
        buttonClick.setOnClickListener {
            val intent =Intent(this, Favourite::class.java)
            startActivity(intent)
            finish()
        }

        val buttonClick3 =findViewById<Button>(R.id.Btn_set)
        buttonClick.setOnClickListener {
            val intent =Intent(this, Settings::class.java)
            startActivity(intent)
            finish()
        }


    }
}