package org.example.lesson_3

fun main() {

    val enemyMoveLogs: String = "D2-D4;0"
    val moveParts = enemyMoveLogs.split("-", ";")
    moveParts.toList<String>()
    val startMove = moveParts[0]
    val endMove = moveParts[1]
    val numberMove = moveParts[2]

    println(startMove)
    println(endMove)
    println(numberMove)
}