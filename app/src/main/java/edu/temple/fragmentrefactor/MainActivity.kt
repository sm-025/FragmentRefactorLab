package edu.temple.fragmentrefactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloFragment = Fragment()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainerView, helloFragment)
            .commit()
    }
}