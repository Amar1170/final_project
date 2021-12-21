package com.example.nama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_indonesia.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pahlawan.setOnClickListener {
            startActivity(Intent(this@MainActivity, PahlawanActivity::class.java))
        }

        presiden.setOnClickListener {
            showErrorSnackBar(resources.getString(R.string.err_msgs_enter_first_name), true)
        }

        pemuda_pancasila.setOnClickListener {
            showErrorSnackBar(resources.getString(R.string.err_msgss_enter_first_name), true)
        }

        val navController = findNavController(R.id.nav_host_fragment)
        bottom_nav.setupWithNavController(navController)
    }
}