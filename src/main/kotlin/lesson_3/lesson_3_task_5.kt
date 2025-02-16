package org.example.lesson_3

fun main() {

    val enemyMoveLogs: String = "D2-D4;0"

    val motion = enemyMoveLogs.split(";")
    val moveDirect = motion[0].split("-")

    val enemyMoveStart = moveDirect[0]
    val enemyMoveEnd = moveDirect[1]
    val enemyMotion = motion[1]

    println(enemyMoveStart)
    println(enemyMoveEnd)
    println(enemyMotion)

}