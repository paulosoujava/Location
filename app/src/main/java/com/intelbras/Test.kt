package com.intelbras

fun main() {
    val zeroToTen = 1..10
    println(1 in zeroToTen)
    println(10 in zeroToTen)

    val zeroUntilTen = 1.until(10)
    println(1 in zeroUntilTen)
    println(10 in zeroUntilTen)
}