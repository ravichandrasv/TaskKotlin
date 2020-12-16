package com.example.taskappkotlin

fun main(array: Array<String>) {
    var a: String? = null
    var newStr: String? = "Kotlin Null Safety"
    newStr = null

    println(newStr)
    println(a)
    val b = "hhhh"
    val l = b!!.length
    val cc = "234"
    val aInt: Int? = cc as? Int
    println(aInt)
    println(l)
//Lazy initialisation
    println("LAZYINITIALISATION")
    println(myVar + " it s lazy")
}

val myVar: String by lazy {
    "Hello"
}