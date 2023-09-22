package com.example.adilbelajar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Application on Start", Toast.LENGTH_SHORT).show();
    }

    override fun onStop() {
        super.onStop();
        Toast.makeText(this, "Application on Stop", Toast.LENGTH_SHORT).show();
    }

    override fun onRestart() {
        super.onRestart();
        Toast.makeText(this, "Application on Restart", Toast.LENGTH_SHORT).show();
    }

    override fun onResume() {
        super.onResume();
        Toast.makeText(this, "Application on Resume", Toast.LENGTH_SHORT).show();
    }   

    override fun onPause() {
        super.onPause();
        Toast.makeText(this, "Application on Pause", Toast.LENGTH_SHORT).show();
    }

    override fun onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Application on Destroy", Toast.LENGTH_SHORT).show();
    }
}