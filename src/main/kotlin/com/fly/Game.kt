package com.fly

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10) + 1
    val scanner = Scanner(System.`in`)
    println(secret)
    var number = 0
    while (number != secret) {
        print("Please enter a number:")
//        number = scanner.nextInt()
        number = readLine()!!.toInt()
        if (number > secret) {
            println("Lower")
        } else if (number < secret) {
            println("Higher")
        } else {
            println("Great,the number is $number")
        }
    }

}

