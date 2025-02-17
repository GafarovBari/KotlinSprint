package org.example.lesson_4

fun main() {

    val bookingToday: Int = 13
    val bookingTomorrow:Int = 9

    val availabilityToday: Boolean = bookingToday < 13
    val availabilityTomorrow: Boolean = bookingTomorrow < 13

    println("Доступность столиков на сегодня: $availabilityToday")
    println("Доступность столиков на завтра: $availabilityTomorrow")
}

const val NUMBER_OF_PLACES: Int = 13