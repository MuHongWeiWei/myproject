package com.fly

fun main(args: Array<String>) {
//    println("Hello kotlin")
    val h = Human()
    h.hello()
}

class Human {
    fun hello() = println("Hello kotlin")
}