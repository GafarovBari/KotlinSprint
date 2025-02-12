package org.example.lesson_1

fun main() {

    val seconds:Int = 6488
    val hours:Int = (seconds/3600)
    val minuts:Int = (6488-hours*3600)/60
    val remainingSeconds:Int = 6488-hours*3600-minuts*60

    println("0$hours:$minuts:0$remainingSeconds")
}