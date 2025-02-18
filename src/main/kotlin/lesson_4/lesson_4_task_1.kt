package org.example.lesson_4

fun main() {

    val bookingToday: Int = 13
    val bookingTomorrow: Int = 9
    val availabilityToday: Boolean = bookingToday < NUMBER_OF_PLACES
    val availabilityTomorrow: Boolean = bookingTomorrow < NUMBER_OF_PLACES

    println("Доступность столиков на сегодня: $availabilityToday")
    println("Доступность столиков на завтра: $availabilityTomorrow")
}

const val NUMBER_OF_PLACES: Int = 13