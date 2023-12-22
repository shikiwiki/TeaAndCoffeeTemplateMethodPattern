package com.example.teaandcoffeetemplatemethodpattern

import java.io.BufferedReader
import java.io.InputStreamReader

class Tea() : CaffeineBeverage() {
    override fun brew() {
        System.out.println("Steeping the tea")
    }

    override fun addCondiments() {
        System.out.println("Adding honey")
    }

    override fun wantsCondiments(): Boolean {
        val answer : String = getUserInput()
        return answer.startsWith("y")
    }

    private fun getUserInput(): String {
        var answer : String = "no"
        System.out.println("Would you like honey?")
        val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
        try {
            answer = bufferedReader.readLine()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return answer
    }
}