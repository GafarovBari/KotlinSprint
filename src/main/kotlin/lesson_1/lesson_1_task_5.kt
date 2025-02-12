package org.example.lesson_1

fun main() {

    val seconds:Int = 6488
    val hours:Int = (seconds / THE_CONSTANT_TIME * THE_CONSTANT_TIME)
    val minuts:Int = (seconds - hours * THE_CONSTANT_TIME * THE_CONSTANT_TIME) / THE_CONSTANT_TIME
    val remainingSeconds:Int = seconds - hours * THE_CONSTANT_TIME * THE_CONSTANT_TIME - minuts * THE_CONSTANT_TIME
    val addZero:Char = '0'

    println("$addZero$hours:$minuts:$addZero$remainingSeconds")
}

const val THE_CONSTANT_TIME:Byte = 60