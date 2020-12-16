package com.example.taskappkotlin

class ClasssAndObject {


        // property (data member)
        private var name: String = "gdgdg"

        // member function
        fun printMe() {
            print("You are at the best Learning website Named-"+name)
        }
    }
    fun main(args: Array<String>) {
        val obj = ClasssAndObject() // create obj object of myClass class
        obj.printMe()

}