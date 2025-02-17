package org.example.lesson_4

fun main() {

    val weight: Int = 50
    val volume: Int = 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Avarage': ${(35 < weight) and (weight <= 100) and (volume < 100)}")
}