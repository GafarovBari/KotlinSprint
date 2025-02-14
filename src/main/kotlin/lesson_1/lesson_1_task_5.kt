package org.example.lesson_1

fun main() {

    val seconds: Int = 6488
    val minutsSpace: Int
    val secondsSpace: Int
    val hoursSpace: Int

    hoursSpace = seconds / (CONSTANT_TIME * CONSTANT_TIME)
    secondsSpace = seconds % CONSTANT_TIME
    minutsSpace = (seconds % (CONSTANT_TIME * CONSTANT_TIME)) / CONSTANT_TIME

    println(String.format("0" + "$hoursSpace" + ":" + "$minutsSpace" + ":" + "0" +"$secondsSpace"))

}

const val CONSTANT_TIME: Byte = 60