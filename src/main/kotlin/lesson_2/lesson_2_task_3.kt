package org.example.lesson_2

fun main() {

    val checkOutHours: Int = 9
    val checkOutMinutes: Int = 39
    val timeOfTravel: Int = 457
    val hoursOfTravel: Int
    val minutesOfTravel: Int
    var arravalHours: Int
    var arravalMinuts: Int
    val arravalTime: String

    hoursOfTravel = timeOfTravel / CONSTANT_TIME
    minutesOfTravel = timeOfTravel % CONSTANT_TIME
    arravalHours = checkOutHours + hoursOfTravel
    arravalMinuts = checkOutMinutes + minutesOfTravel

    if (arravalMinuts > 59) {

        arravalHours = arravalHours + 1
        arravalMinuts = arravalMinuts - CONSTANT_TIME
    }

    arravalTime = "$arravalHours:$arravalMinuts"

    println(arravalTime)

}

const val CONSTANT_TIME: Int = 60