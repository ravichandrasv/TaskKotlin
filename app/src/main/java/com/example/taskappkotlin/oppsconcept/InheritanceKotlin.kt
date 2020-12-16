package com.example.taskappkotlin.oopsconcept

import android.app.Person

fun main(array:Array<String>){
   // val parentA=ParentA("parentA","12")
    val childA=childA("Hi","22")
    childA.printChildA()
    print("\n")
    val childB=ChildB("Helllo","32")
    childB.printChildB()

}
open class ParentA(name:String,age:String){
    init {
        print("\t $name \t $age")
    }
}
class childA(name:String,age: String):ParentA(name,age ){
    fun printChildA(){
        print("\tChildA")
    }

}
class ChildB(name:String,age:String):ParentA(name,age){
    fun printChildB(){
        print("\tChildB")
    }
}