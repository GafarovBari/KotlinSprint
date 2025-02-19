package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val taskOne: Int = Random.nextInt(0,101)
    val taskTwo: Int = Random.nextInt(0,101)
    val answer: Int = taskOne + taskTwo

    println("Докажите, что вы не робот. Сложите два числа: $taskOne + $taskTwo ")

    val userAnswer = readln().toInt()

    if (userAnswer == answer)
        println("Добро пожаловать!")

    else
        println("Доступ запрещен")
}