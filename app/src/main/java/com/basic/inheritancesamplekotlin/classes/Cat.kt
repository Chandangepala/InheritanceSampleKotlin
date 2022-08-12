package com.basic.inheritancesamplekotlin.classes

class Cat: Animal("Cat") {
    fun meow(){
        println("Meow!!!")
    }

    override fun makeSound() {
        println("makeSound:: Meow!!!")
    }
}