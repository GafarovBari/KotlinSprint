package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val depoositAmount: Double = 70000.0
    val interestRate: Double = 16.7
    val deposidPeriod: Double = 20.0

    val totalAmount: Double = depoositAmount * (1 + interestRate / FULL_PERCENTAGE / CONSTANT_YEAR).pow(NUMBER_MONTHS)
    val income: Double = totalAmount - depoositAmount

    println(String.format("%.3f", income))
}

const val FULL_PERCENTAGE = 100
const val CONSTANT_YEAR = 12
const val NUMBER_MONTHS = 240