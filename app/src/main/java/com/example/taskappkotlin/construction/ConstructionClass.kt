package com.example.taskappkotlin.construction
fun main(args: Array<String>) {
    val person1 = Perason("TutorialsPoint.com", 15)
    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")
}
class Perason(val firstName: String, var age: Int) {
}