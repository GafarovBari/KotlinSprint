package org.example.lesson_3

fun main() {

    val enemyMoveLogs: String = "D2-D4;0"

    val (startMove, endMove, numberMove) = enemyMoveLogs.split(Regex("[-;]"))

    println(startMove)
    println(endMove)
    println(numberMove)
}