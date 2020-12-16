package com.example.taskappkotlin.oopsconcept

open abstract class  AbstractClassA(name:String)
{
    val name=name
    init {
        print("\t In Abstact level 1 ${name}")
    }
    fun callNonAbstactMethod(age:Int){
        print("\tAge: ${age}")
    }
    abstract fun callAbstactMethod(othervale:Int)
}
 class ChildAAA(name:String):AbstractClassA(name){
    override fun callAbstactMethod(othervale: Int) {
        print("\t Abstarct method: ${name}")
    }

}
fun main(arry:Array<String>){
val childAA=ChildAAA("ELON")
    childAA.callAbstactMethod(222)
    childAA.callNonAbstactMethod(12)


}