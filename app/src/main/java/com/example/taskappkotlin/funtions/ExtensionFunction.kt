package com.example.taskappkotlin.funtions

fun String.rOneMoreString(): String =  this+"ddd"

fun main(args: Array<String>) {
    val myString= "Hello Other String"
    val result = myString.rOneMoreString()
    println("Complte String: $result")
}