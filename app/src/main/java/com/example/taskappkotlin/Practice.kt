package com.example.taskappkotlin


//Lamda functions
fun main() {
    val addedValue:(Int,Int)->Unit
    ={rec:Int,aa:Int->print(rec+aa)}
    callAddValue(addedValue)
}

fun callAddValue(addedValue: (Int,Int) -> Unit) {
    val a=5+6
    addedValue(a,a)

}
