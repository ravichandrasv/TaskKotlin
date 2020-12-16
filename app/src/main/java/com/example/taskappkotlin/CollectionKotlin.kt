package com.example.taskappkotlin

fun main(args: Array<String>){
    //List Immutable Listof,MapOf,SetOf
    var stringList: List<String> = listOf<String>("Ajay","Vijay","Prakash")
    var anyList: List<Any> = listOf<Any>(1,2,3,"Ajay","Vijay","Prakash")

    println()
    println("print string list")
    for(element in stringList){
        println(element)
    }
    println()
    println("print any list")
    for(element in anyList){
        println(element)
    }

    //MutableList

    var mutableList1 = mutableListOf("Ajay","Vijay")
    mutableList1.add("Prakash")
    mutableList1.add("Vijay")

    var mutableList2 = mutableListOf<String>()
    mutableList2.add("Ajeet")
    mutableList2.add("Amit")
    mutableList2.add("Akash")

    mutableList1.forEach{
        print(it)
    }
    for(element in mutableList2){
        println(element)
    }

//ArrayList
    val arrayList = ArrayList<String>()//Creating an empty arraylist
    arrayList.add("Ajay")//Adding object in arraylist
    arrayList.add("Vijay")
    arrayList.add("Prakash")
    arrayList.add("Rohan")
    arrayList.add("Vijay")
    println(".......print ArrayList.......")
    for (i in arrayList) {
        println(i)
    }
//HasMap
    val hashMap:HashMap<Int,String> = HashMap<Int,String>() //define empty hashmap
    hashMap.put(1,"Ajay")
    hashMap.put(3,"Vijay")
    hashMap.put(4,"Praveen")
    hashMap.put(2,"Ajay")
    println(".....traversing hashmap.......")
    for(key in hashMap.keys){
        println("Element at key $key = ${hashMap[key]}")
    }

    //Set
    var hashSet = HashSet<Int>(6)
    hashSet.add(2)
    hashSet.add(13)
    hashSet.add(6)
    hashSet.add(5)
    hashSet.add(2)
    hashSet.add(8)
    println("......traversing hashSet......")
    for (element in hashSet){
        println(element)
    }
}