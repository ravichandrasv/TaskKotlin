package com.example.taskappkotlin.construction
fun main(arr: Array<String>) {
    PrimaryConstruction(1, "Primary constructor")
    DefaultValueConstructor()
    val stu = Student("Chaitanya", 31)

    println("Student Name: ${stu.name}")
    println("Student Age: ${stu.age}")
    SecondaryConstructor("JAK", 21)
    ChildConstructor("Good","22")

}

class PrimaryConstruction(a: Int, b: String) {

    init {
        val a: Int = a
        val b: String = b
        print("\t" + a + "\t")
        print(b)
    }
}

class DefaultValueConstructor(a: Int = 9, b: String = "defaultValue Constructor") {
    val a = a
    val b = b

    init {
        print("\t$a" + "\t")
        print("$b")
    }
}

class Student(val name: String, var age: Int) {

}

class SecondaryConstructor {
    constructor(name: String, age: Int):this(name,age,"bangalore") {
        print("\t ${name}\t${age}")
    }
    constructor(name: String, age: Int,address:String) {
        print("\t ${name}\t${age}\t${address}")
    }
}
open class InheritConstructor{
    constructor(name:String,secondary:String){
        print("\t Parent ${name}\t ${secondary}")
    }
}
class ChildConstructor:InheritConstructor{
    constructor(nameInHerit:String,ageinHerit:String):super(nameInHerit,ageinHerit ){
        print("\tChild Class ${nameInHerit}\t ${ageinHerit}")
    }
}