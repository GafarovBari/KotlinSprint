package org.example.lesson_2

fun main() {

    val studentAndrey: Double = 3.0
    val studentAlexander: Double = 4.0
    val studentAnton: Double = 3.0
    val studentMaria: Double = 5.0
    val avarageScore: Double

    avarageScore = (studentAndrey + studentAlexander + studentAnton + studentMaria) / AVARAGE_CONSTANT

    println(avarageScore)

}

const val AVARAGE_CONSTANT: Int = 4