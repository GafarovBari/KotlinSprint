package org.example.lesson_5

import kotlin.math.pow

fun main() {

    println("Пожалуйста, введите ваш вес (кг):")
    val userWeight = readln().toDouble()

    println("Пожалуйста, введите ваш рост (см):")
    val userHeight = readln().toDouble()

    val userHeightMeters = userHeight / METERS
    val bodyMassIndex = userWeight / userHeightMeters.pow(DEGREE)
    val bodyMassIndexFormatted = String.format("%.2f", bodyMassIndex)

    println("Ваш ИМТ: $bodyMassIndexFormatted")

    if (bodyMassIndex < BMI_MIN) {
        println("Недостаточная масса тела")
    } else if (BMI_MIN <= bodyMassIndex && bodyMassIndex < BMI_NORMAL) {
        println("Нормальная масса тела")
    } else if (BMI_NORMAL <= bodyMassIndex && bodyMassIndex < BMI_MAX) {
        println("Избыточная масса тела")
    } else {
        println("Ожирение")
    }
}

const val METERS: Int = 100
const val DEGREE: Int = 2
const val BMI_MIN: Double = 18.5
const val BMI_NORMAL: Double = 25.0
const val BMI_MAX: Double = 30.0
