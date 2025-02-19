package org.example.lesson_5

fun main() {

    println("Добро пожаловать! Пожалуйста, введите год рождения")
    val userYear = readln().toInt()

    if (CURRENT_YEAR - userYear == AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")

    else
        println("Доступ запрещен")
}

const val CURRENT_YEAR: Int = 2025
const val AGE_OF_MAJORITY: Int = 18