package com.basic.inheritancesamplekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.basic.inheritancesamplekotlin.classes.Animal
import com.basic.inheritancesamplekotlin.classes.Cat
import com.basic.inheritancesamplekotlin.classes.Dog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dog: Dog = Dog()
        dog.bark()
        dog.makeSound()

        var cat: Cat = Cat()
        cat.meow()
        cat.makeSound()

        //Anonymous object
        var bear =  object : Animal("polarBear"){
            //overriding abstract method makesound
            override fun makeSound() {
                println("makeSound:: ROAR!!!")
            }
        }

        bear.makeSound()
    }

}