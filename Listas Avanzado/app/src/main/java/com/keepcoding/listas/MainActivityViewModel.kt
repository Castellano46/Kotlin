package com.keepcoding.listas

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {


    fun ponerPrimero(hero: Hero, list: List<Hero>): List<Hero> {
        val mutableList = list.toMutableList()
        mutableList.remove(hero)
        mutableList.add(0, hero)
        return mutableList
    }

}