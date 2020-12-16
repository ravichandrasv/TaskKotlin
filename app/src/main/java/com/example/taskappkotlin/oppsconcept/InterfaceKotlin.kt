package com.example.taskappkotlin.oopsconcept

interface  InterFaceAA{
    val one:String
    fun inFun():String
    fun valuFunction(a:Int,b:String){
        print("\t ${a}\t${b}")
    }

}
class ClassInterFaceIMP:InterFaceAA{
    override val one: String="Hi"
    override fun inFun(): String ="Hello"

}
fun main(array:Array<String>){
    val classInterFace=ClassInterFaceIMP()
    print(classInterFace.one+"\n")
    print(classInterFace.inFun()+"\n")
    classInterFace.valuFunction(12,"Musk")
}