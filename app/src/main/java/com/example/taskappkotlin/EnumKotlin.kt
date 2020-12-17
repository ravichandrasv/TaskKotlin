package com.example.taskappkotlin

enum class Months{
    January,
    February,
    March
}

fun main(args: Array<String>) {

    println(Months.January) //prints January
    println(Months.values().size) //prints 3
    println(Months.valueOf("March")) //prints March

    for (enum in Months.values()) {
        println(enum.name)
    }
//it will throw eror no data found
    println(Months.valueOf("Mar"))
}