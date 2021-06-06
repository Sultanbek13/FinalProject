package com.example.finalproject

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.ui.start.StartFragment


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val toolbar: Toolbar = findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, StartFragment())
            .addToBackStack(StartFragment::class.simpleName).commit()

//        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
//        val navView: NavigationView = findViewById(R.id.nav_view)
//        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
//
//        drawerLayout.addDrawerListener(toggle)
//        toggle.syncState()
//
//        navView.setNavigationItemSelectedListener {
//            when (it.itemId) {
//                R.id.nav_home -> {
//                    return@setNavigationItemSelectedListener true
//                }
//                R.id.nav_gallery -> {
//                    return@setNavigationItemSelectedListener true
//                }
//                R.id.nav_slideshow -> {
//                    return@setNavigationItemSelectedListener true
//                }
//                else -> return@setNavigationItemSelectedListener false
//            }
//        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }
}