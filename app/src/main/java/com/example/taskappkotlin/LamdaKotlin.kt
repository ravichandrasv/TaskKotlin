package com.example.taskappkotlin

fun main(args: Array<String>) {
    val product = { a: Int, b: Int -> a * b }
    val result = product(9, 3)
    println(result)

    //Example 2
    val greeting = { println("Hey")}

    // invoking function
    greeting()
}