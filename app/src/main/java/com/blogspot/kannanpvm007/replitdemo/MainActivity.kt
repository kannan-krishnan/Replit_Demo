package com.blogspot.kannanpvm007.replitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.yes).setOnClickListener {
            Toast.makeText(this, "U chose Yes", Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.no).setOnClickListener {
            Toast.makeText(this, "U chose No", Toast.LENGTH_SHORT).show()
        }
    }
}