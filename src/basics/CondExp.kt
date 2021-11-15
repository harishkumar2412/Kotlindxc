package basics

import kotlin.math.min

class CondExp {
}

fun main() {
    fun max(a: Int, b: Int) = if (a > b) a else b         // 1

    println(max(99, -42))
    println(min(12,10))
}