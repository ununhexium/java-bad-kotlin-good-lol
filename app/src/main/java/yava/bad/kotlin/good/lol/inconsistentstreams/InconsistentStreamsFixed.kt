package yava.bad.kotlin.good.lol.inconsistentstreams

import java.util.stream.IntStream
import java.util.stream.Stream

object InconsistentStreamsFixed {
    private const val ADULT_CONSTANT_AGE = 25
    @JvmStatic
    fun main(args: Array<String>) {
        val childrenAges = listOf(2, 5, 17)
        val adultCount = 3

        // yes
        val allAges = List(adultCount){ ADULT_CONSTANT_AGE } + childrenAges
    }
}
