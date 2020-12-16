package com.example.taskappkotlin

object CompanionObject{
    fun printLikeSttaic(){
      print("i am like static in jave")
    }
}
fun main(arry:Array<String>){
    CompanionObject.printLikeSttaic()
}