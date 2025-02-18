package org.example.lesson_4

fun main() {

    val currentDay: Int = 5

    println("""
        |Упражнения для рук:    ${currentDay % PARITY !== REMAINS}
        |Упражнения для ног:    ${currentDay % PARITY == REMAINS}
        |Упражнения для спины:  ${currentDay % PARITY == REMAINS}
        |Упражнения для пресса: ${currentDay % PARITY !== REMAINS}
    """.trimMargin())

}

const val PARITY: Int = 2
const val REMAINS: Int = 0