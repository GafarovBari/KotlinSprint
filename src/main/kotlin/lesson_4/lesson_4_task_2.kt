package org.example.lesson_4

fun main() {

    val weight: Int = 50
    val volume: Int = 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Avarage': ${(WEIGHT_WITHOUT_MIN < weight) and (weight <= WEIGHT_MAX) and (volume < VOLUME_WITHOUT_MIN)}")
}

const val WEIGHT_WITHOUT_MIN: Int = 35
const val WEIGHT_MAX: Int = 100
const val VOLUME_WITHOUT_MIN: Int = 100