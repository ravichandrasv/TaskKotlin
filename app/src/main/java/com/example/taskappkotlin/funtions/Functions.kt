package com.example.taskappkotlin.funtions

fun main(args: Array<String>) {
    callMethod()
    callWithvalue(4)
    val returnvalue = callForReturn(4, 5)
    print("\n")
    print("Return Value=" + returnvalue)
    print("\n")
    displayBorder()
    print("\n")
    namedFunction()
    print("\n")
}



fun callForReturn(i: Int, i1: Int): Any {
    return i + i1
}

fun callWithvalue(i: Int) {

    print("\n" + i)
}

fun callMethod() {
    print("hello")
}

//Default function
fun displayBorder(character: Char = '*', length: Int = 15) {
    for (i in 1..length) {
        print(character)
    }
}

//Named Function
fun namedFunction(a:Int=10,nb:String="ahah") {

print("name String ${a}+${nb}")
}
val eps = 1E-10

