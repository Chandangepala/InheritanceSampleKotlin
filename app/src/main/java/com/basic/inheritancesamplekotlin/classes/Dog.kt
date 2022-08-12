package com.basic.inheritancesamplekotlin.classes

import android.util.Log

class Dog(): Animal("Dog") {
    fun bark(){
        println("WOFFF!")
        Log.d("Dog::", "WOFF!!!")
    }

    override fun makeSound() {
        println("makeSound:: WOFF!!")
    }
}