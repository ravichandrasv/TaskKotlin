package com.example.taskappkotlin.stringinterpolation

fun main(args: Array<String>) {
    val str1 = "Hello"
    val str2 = "Hello"
    println(str1 == str2) //true
    println(str1 != str2) //false
    print(str1.length)
    print("\n" + str1[0])
    print("\n" + str1 + str2)
    print("\n" + str1.split("e")[1])
    print("\n" + str1.subSequence(2, 4))
    val concatenated = str1 + str2
    print("\n" + concatenated)
    print("\n" + str1.compareTo(str2))


    print("\r Howw")
    print("\b Are")


}