package org.example.lesson_4

fun main() {

    val currentDamage: Boolean = true
    val currentCrew: Int = 70
    val provisions: Int = 50
    val weatherConditions: Boolean = true

    val readyToSail: Boolean = (currentDamage == DAMAGE && currentCrew <= NUMBER_CREW_MIN && currentCrew <= NUMBER_CREW_MAX && provisions > PROVISIONS_MIN_OUT && weatherConditions == NORM_WEATHER_CONDITIONS || weatherConditions !== NORM_WEATHER_CONDITIONS) || (currentDamage !== DAMAGE && currentCrew == NUMBER_CREW_MAX && weatherConditions == NORM_WEATHER_CONDITIONS && provisions >= PROVISIONS_MIN_OUT)

    println(readyToSail)
}

const val NUMBER_CREW_MIN: Int = 55
const val NUMBER_CREW_MAX: Int = 70
const val PROVISIONS_MIN_OUT: Int = 50
const val NORM_WEATHER_CONDITIONS: Boolean = true
const val DAMAGE: Boolean = false
