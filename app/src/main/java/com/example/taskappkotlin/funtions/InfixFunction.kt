package com.example.taskappkotlin.funtions

class InfixFunction() {

    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            println(i)
        }
    }
}

fun main(args: Array<String>) {
    val p = InfixFunction()
    p createPyramid 4       // p.createPyramid(4)
}
