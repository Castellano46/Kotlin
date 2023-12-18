package com.keepcoding.keepcoding1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_google_constraint_layout)
        println("Soy el println")
        Log.d("Carlos", "Soy el log nivel d")
        Log.i("Carlos", "Soy el log nivel d")
        Log.w("Carlos", "Soy el log nivel d")
        Log.e("Carlos", "Soy el log nivel d")
        Log.wtf("Carlos", "Soy el log nivel d")
    }

}