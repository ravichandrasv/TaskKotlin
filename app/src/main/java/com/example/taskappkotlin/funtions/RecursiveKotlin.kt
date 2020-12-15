package com.example.taskappkotlin.funtions

fun main(args: Array<String>) {
    val dd= findFixPoint()
    print(dd)
}
private fun findFixPoint(): Double {
    var x = 1.0
    while (true) {
        val y = Math.cos(x)
        if (Math.abs(x - y) < eps) return x
        x = Math.cos(x)
    }
}
