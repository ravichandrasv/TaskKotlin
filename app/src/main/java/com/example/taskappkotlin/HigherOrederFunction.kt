package com.example.taskappkotlin

//call function as parameter to another

fun main(args: Array<String>) {

    func("For Inner Function", ::demo)

}

fun func(str: String, myfunc: (String) -> Unit) {
    print("For Outer Print ")
    myfunc(str)
}
fun demo(str: String) {
    println(str)
}