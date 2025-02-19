package org.example.lesson_4

fun main() {

    val currentDay: Int = 6
    val isEven: Boolean = currentDay % PARITY == REMAINS

    println("""
        |Упражнения для рук:    ${!isEven}
        |Упражнения для ног:    ${isEven}
        |Упражнения для спины:  ${isEven}
        |Упражнения для пресса: ${!isEven}
    """.trimMargin()
    )
}

const val PARITY: Int = 2
const val REMAINS: Int = 0