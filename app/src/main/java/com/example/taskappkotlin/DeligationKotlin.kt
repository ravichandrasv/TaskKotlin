package com.example.taskappkotlin

interface Base {
    fun print(){
        print("I am Calling from delegation")
    }
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(b: Base) : Base by b

fun main() {
    val b = BaseImpl(10)
    Derived(b).print()
}