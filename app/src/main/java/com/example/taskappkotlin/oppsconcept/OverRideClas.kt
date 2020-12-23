package com.example.taskappkotlin.oopsconcept

open class ParentAA() {
    open fun printFunction(name: String, age: Int) {
        print("\t ${name}\t ${age}")
    }
}

class ChildAA : ParentAA() {
    override fun printFunction(name: String, age: Int) {
        super.printFunction(name, age)
        print("Child Class Override ${age - 2}")
    }
}

fun main(aa: Array<String>) {
    val childAA = ChildAA()
    childAA.printFunction("Jack", 22)
}