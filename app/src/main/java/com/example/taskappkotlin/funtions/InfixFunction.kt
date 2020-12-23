package com.example.taskappkotlin.funtions

class InfixFunction() {

    infix fun createPyramid(rows: Int) {
        for (i in 1..rows) {
            println(i)
        }
    }
}

fun main(args: Array<String>) {
    val p = InfixFunction()
    // in fix is single parameter function , we can pass only one parameter
    p createPyramid 4       // p.createPyramid(4)
}
