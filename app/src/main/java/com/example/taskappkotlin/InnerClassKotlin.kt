package com.example.taskappkotlin

class outerClass{
    private  var name: String = "JACK"
    inner class  innerClass{
        var description: String = "u r  inner class"
        private var id: Int = 16465501
        fun foo(){
            println("name is ${name}") // access the outer class member even private
            println("Id is ${id}")
        }
    }
}
fun main(args: Array<String>){
    println(outerClass().innerClass().description) // accessing property
    var obj = outerClass().innerClass() // object creation
    obj.foo() // access member function

}