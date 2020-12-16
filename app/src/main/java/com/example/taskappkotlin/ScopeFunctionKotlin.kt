package com.example.taskappkotlin


//let,run,with,apply
fun main(arra:Array<String>){

    //let similarly like lamda expressio take object perform action  and return
    var str = "Hello"
    str.let { println("$it!!") }
        //Retun
    println(str)

        //run doenot support it
    var tut = "This is Kotlin "
    println(tut) //This is Kotlin Tutorial
    tut = run {
        val tutorial = "This is run function"
        tutorial
    }
    println("I am printing run")
    println(tut)

    //with also return

    val valueIs = "Jack and jill went up the hill!"
    val result = with(valueIs) {
        this.contains("yup")
    }
    println("I am printing with")
    println(valueIs)
    println(result)

    //Also Object reference operation

    val v1 = "Jack and jill went up the hill!"
    val r1 = valueIs.also {
        it.contains("jill")
    }

    println("I am printing Also")
    println(v1)    //  o/p - Jack and jill went up the hill!
    println(r1)     //  o/p - Jack and jill went up the hill!
}
