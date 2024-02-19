package yava.bad.kotlin.good.lol.inconsistentstreams

import java.util.stream.IntStream
import java.util.stream.Stream

private const val ADULT_CONSTANT_AGE = 25

fun main(args: Array<String>) {
    val childrenAges = listOf(2, 5, 17)
    val adultCount = 3

    // actually not even a stream anymore
    val allAges = List(adultCount) { ADULT_CONSTANT_AGE } + childrenAges
}
