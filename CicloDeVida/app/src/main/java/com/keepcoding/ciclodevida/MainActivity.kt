package com.keepcoding.ciclodevida

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object {
        private val VECES_ON_CREATE = "VECES_ON_CREATE"
        private val VECES_ON_DESTROY = "aaaa"
        private val VECES_ON_STOP = "bbbb"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("CicloDeVida", "onCreate")

        val vecesOnCreate = cargarDePreferencias(VECES_ON_CREATE)
        Log.w("CicloDeVida", "vecesOnCreate = $vecesOnCreate")
        guardarEnPreferences(VECES_ON_CREATE, vecesOnCreate + 1)
    }
    fun cargarDePreferencias(key: String) = getPreferences(Context.MODE_PRIVATE).getInt(key, 0)

    fun guardarEnPreferences(key: String, num: Int) =
        getPreferences(Context.MODE_PRIVATE).edit().apply {
            putInt(key, num)
            apply()
        }

    /*
    fun cargarDePreferencias(): Int {
        val preferences = getPreferences(Context.MODE_PRIVATE)
        val valorLeido = preferences.getInt("VECES_ON_CRECEATE", 0)
        return valorLeido
    }
    fun guardarEnPreferences(vecesOnCreate: Int){
        val preferences = getPreferences(Context.MODE_PRIVATE)
        val preferencesEditables = preferences.edit()
        preferencesEditables.putInt("VECES_ON_CRECEATE", vecesOnCreate + 1)
        preferencesEditables.apply()
    }
    */

    override fun onStart() {
        super.onStart()
        Log.w("CicloDeVida", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.w("CicloDeVida", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.w("CicloDeVida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("CicloDeVida", "onStop")
        val vecesOnStop = cargarDePreferencias(VECES_ON_STOP)
        Log.w("CicloDeVida", "vecesOnStop = $vecesOnStop")
        guardarEnPreferences(VECES_ON_STOP, vecesOnStop + 1)

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("CicloDeVida", "onDestroy")
        val vecesOnDestroy = cargarDePreferencias(VECES_ON_DESTROY)
        Log.w("CicloDeVida", "vecesOnDestroy = $vecesOnDestroy")
        guardarEnPreferences(VECES_ON_DESTROY, vecesOnDestroy + 1)

    }

    override fun onRestart() {
        super.onRestart()
        Log.w("CicloDeVida", "onRestart")
    }

}