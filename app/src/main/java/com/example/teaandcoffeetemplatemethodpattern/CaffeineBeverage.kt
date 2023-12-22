package com.example.teaandcoffeetemplatemethodpattern

abstract class CaffeineBeverage {
    final fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        if (wantsCondiments()) addCondiments()
    }

    abstract fun brew()

    abstract fun addCondiments()

    fun boilWater() {
        System.out.println("Boiling water")
    }

    fun pourInCup() {
        System.out.println("Pour in cup")
    }

    open fun wantsCondiments(): Boolean {
        return true
    }
}