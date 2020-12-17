package com.example.taskappkotlin

data class Person1(var name: String, var tutorial: String)
data class Person2(var n: String, var t: String)
data class Person4(var name1: String, var tutorial1: String)

fun main(array: Array<String>) {

    //Here we can change object refrence Value (DATA CLASS Value)
    var person = Person1("Anupam", "Kotlin")

    var l = person.let { it.tutorial = "Android" }
    var al = person.also { it.tutorial = "Android" }
//let will not object value only also and apply will change

    println("It and Also")
    println(l)
    println(al)
    println(person)

//Object reference we can change and we can use it also here ALSO SCOPE
    var person2 = Person1("Anupam", "Kotlin")

    person2.apply { this.tutorial = "Swift" }

    println("Apply")
    println(person)

    //Also vs Appply
    //directly we can change object name in apply but in alos we have to take it as refrence
    var person3 = Person2("Anupam", "Kotlin")
    println("Apply and Also")
    person3.apply { t = "Swift" }
    println(person)

    person3.also { it.t = "Kotlin" }
    println(person)

//In with we are passing object directly as refrence
    var person4 = Person4("Anupam", "Kotlin")

    with(person4)
    {
        name1 = "No Name"
        tutorial1 = "Kotlin tutorials"
    }
    println("With")
    println("${person4}")

}