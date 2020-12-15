package com.example.taskappkotlin.stringinterpolation

fun main(args: Array<String>) {
    val i: Int = 2

    if (i in 1..4) {
        print("${i}\n")
    }
    for (i in 1..5) {
        print("${i}\t")
    }
    print("\n")
    for (i in 4 downTo 1) {
        print("${i}\t")
    }
    print("\n")
    for (i in 1..6 step 2) {
        print("${i}")
    }
    print("\n")
    for (i in 6 downTo 1 step 2) {
        print("${i}")
    }
    val arrayStringValue = listOf("a", "b", "c", "d", "e", "f", "g")
    val b = arrayStringValue.iterator()
    print("\n ")
    while (b.hasNext()) {
        print(b.next() + "\t")
    }
    var item: String
    for (item in arrayStringValue) {
        print(item)
    }
    print("\n")
    arrayStringValue.forEach {
    print(it)
        val c=arrayStringValue.listIterator()
        while (c.hasPrevious()){
            print(c.previous())
        }
}

    val a=10
    val c=12
    print("\n")
    if (a > c){
        print("a is greater")
    }
    else{
        print("c is greater")
    }
    print("\n")
    when(a){
        10-> print("its A Value")
        12-> print("its c value")
        else-> print("Not in list")
    }

}


