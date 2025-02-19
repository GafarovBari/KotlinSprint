package org.example.lesson_5

fun main() {
    val winningNumber1 = 15
    val winningNumber2 = 27
    var correctCount1 = 0
    var correctCount2 = 0

    println("Введите первое число от 0 до 42:")
    val userInput1 = readln().toInt()

    println("Введите второе число от 0 до 42:")
    val userInput2 = readln().toInt()

    if (userInput1 == winningNumber1 || userInput1 == winningNumber2) {
        correctCount1 += 1
    }

    if (userInput2 == winningNumber1 || userInput2 == winningNumber2) {
        correctCount2 += 1
    }

    when (correctCount1 + correctCount2) {
        2 -> println("Поздравляем! Вы выиграли главный приз!")
        1 -> println("Вы выиграли утешительный приз!")
        0 -> println("Неудача! Правильные числа: $winningNumber1 и $winningNumber2")
    }

    if (correctCount1 == 1 && correctCount2 == 0) {
        println("Второе правильное число: $winningNumber2")
    }

    if (correctCount1 == 0 && correctCount2 == 1) {
        println("Первое правильное число: $winningNumber1")
    }
}

