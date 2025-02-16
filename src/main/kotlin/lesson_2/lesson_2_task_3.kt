package org.example.lesson_2

fun main() {

    val checkOutHours: Int = 9
    val checkOutMinutes: Int = 39
    val timeOfTravel: Int = 457

    val minutes: Int = timeOfTravel % CONSTANT_TIME
    val arrivalMinutes: Int = (checkOutMinutes + minutes) % CONSTANT_TIME
    val additionalMinutes: Int = checkOutMinutes + minutes
    val arrivalHours: Int = (timeOfTravel / CONSTANT_TIME) + (additionalMinutes / CONSTANT_TIME) + checkOutHours

    println("%02d:%02d".format(arrivalHours,arrivalMinutes))

}

const val CONSTANT_TIME: Int = 60