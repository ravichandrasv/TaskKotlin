package com.example.taskappkotlin

fun main(args: Array<String>) {
    val square = { number: Int -> number * number }

    //without declaring we can call function
    val nine = square(3)
    print(nine)
}