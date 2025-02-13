package org.example.lesson_2

import kotlin.math.roundToInt

fun main() {

    val crystalOre: Int = 7
    val ironeOre: Int = 11
    val crystalBuff: Int
    val ironeBuff: Int

    crystalBuff = crystalOre * BUFF_ORE / ABSOLUTE_CONSTANT
    ironeBuff = ironeOre * BUFF_ORE / ABSOLUTE_CONSTANT

    println("Увеличение добычи кристаллической руды (20%): $crystalBuff")
    println("Увеличение добычи железной руды (20%): $ironeBuff")

}

const val BUFF_ORE: Int = 20
const val ABSOLUTE_CONSTANT: Int = 100
