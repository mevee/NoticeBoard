package com.dbtest

import java.lang.Integer.MAX_VALUE
import java.lang.Integer.MIN_VALUE

fun main() {


    val array = listOf(2, 5, 7, 23, 1, 65, 32, 87, 14, 678, 234, 235, 12, 11, 22, 66, 432)
    var largest: Int
    var secondLargest: Int
    largest = MIN_VALUE
    secondLargest = largest

    for (i in array.indices) {
        if (largest < array[i]) {
            largest = array[i]
        } else {

        }

    }

//    print("Largest is $largest")
//    print("Second Largest is $secondLargest")

    moveAllZerosToEnd(arrayOf(0,1,0,3,12))

}

fun moveAllZerosToEnd(array: Array<Int>) {
    println("Old  array")

    for (index in array.indices)
        print(" "+array[index])
        println("")
        println("")

    var countNoNzeroes=0;
    for (index in 0..array.size-1)
    {
        if (array[index]!=0)
            array[countNoNzeroes++]=array[index]
    }

    while(countNoNzeroes<array.size){
        array[countNoNzeroes++]=0
    }


    print("Total zero found $countNoNzeroes")

    println("")
    println("")
    println("new array")
    for (index in array.indices)
        print(" "+array[index])

    /*"
    0 1 ->1 0
    0 3 ->3 0


    "*/
}

