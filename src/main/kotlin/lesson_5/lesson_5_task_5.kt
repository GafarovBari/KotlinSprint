package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val winningNumbers = mutableListOf<Int>()
    while (winningNumbers.size < 3) {
        val number = Random.nextInt(0, 43)
        if (!winningNumbers.contains(number)){
            winningNumbers.add(number)
        }
    }

    val userNumbers = mutableListOf<Int>()

    for (i in 1..3) {
        println("Введите $i-е число от 0 до 42:")
        val userInput = readln().toInt()
        userNumbers.add(userInput)
    }

    val matchingNumbers =
        winningNumbers.intersect(userNumbers)
    val matchCount = matchingNumbers.size

    when (matchCount) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Неплохо! Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз.")
        0 -> println("Неудача! Вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: $winningNumbers")
}