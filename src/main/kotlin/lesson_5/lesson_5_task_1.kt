package org.example.lesson_5

fun main() {

    val taskOne: Int = 6
    val taskTwo: Int = 7
    val answer: Int = 13

    println("Докажите, что вы не робот. Сложите два числа: $taskOne + $taskTwo ")

    val userAnswer = readln().toInt()

    if (userAnswer == answer)
        println("Добро пожаловать!")

    else
        println("Доступ запрещен")
}