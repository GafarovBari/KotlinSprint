package org.example.lesson_4

fun main() {

    val weather: Boolean = true
    val awning: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"

    val conditions = (weather == true) and (awning == true) and (airHumidity == 20) and (season != "зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions ")
}