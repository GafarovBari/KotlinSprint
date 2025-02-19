package org.example.lesson_4

fun main() {

    val isWhole: Boolean = true
    val currentCrew: Int = 70
    val provisions: Int = 50
    val isSunny: Boolean = true

    val readyToSail: Boolean = (
            isWhole == DAMAGE
            && currentCrew <= NUMBER_CREW_MIN
            && currentCrew <= NUMBER_CREW_MAX
            && provisions > PROVISIONS_MIN_OUT
            && isSunny == NORM_WEATHER_CONDITIONS
            || isSunny !== NORM_WEATHER_CONDITIONS)
            || (
            isWhole !== DAMAGE
            && currentCrew == NUMBER_CREW_MAX
            && isSunny == NORM_WEATHER_CONDITIONS
            && provisions >= PROVISIONS_MIN_OUT)

    println(readyToSail)
}

const val NUMBER_CREW_MIN: Int = 55
const val NUMBER_CREW_MAX: Int = 70
const val PROVISIONS_MIN_OUT: Int = 50
const val NORM_WEATHER_CONDITIONS: Boolean = true
const val DAMAGE: Boolean = false
