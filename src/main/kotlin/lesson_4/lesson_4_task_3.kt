package org.example.lesson_4

fun main() {

    val weather: Boolean = true
    val awning: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"

    val conditions = (weather == NORMAL_WEATHER) and (awning == AWNING_IS_OPEN) and (airHumidity == AIR_HUMIDITY_NORMAL) and (season != OFF_SAESON)

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions ")
}

const val NORMAL_WEATHER: Boolean = true
const val AWNING_IS_OPEN: Boolean = true
const val AIR_HUMIDITY_NORMAL: Int = 20
const val OFF_SAESON: String = "зима"