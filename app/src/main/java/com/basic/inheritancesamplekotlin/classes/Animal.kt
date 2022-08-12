package com.basic.inheritancesamplekotlin.classes

import android.util.Log

//abstract forbids to create object or instance of this class
abstract class Animal(var name: String) {
    init {
        println("My name is: $name")
        Log.d("Animal::", "My name is:$name")
    }

    abstract fun makeSound()
}