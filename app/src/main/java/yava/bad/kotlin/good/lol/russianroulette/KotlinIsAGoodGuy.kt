package yava.bad.kotlin.good.lol.russianroulette

import java.util.*
import java.util.stream.IntStream

fun main(args: Array<String>) {
    /*
     * Java makes no difference between mutable and immutable collections,
     * leading to unexpected exceptions.
     */
    repeat(100) {
        val config = goGetSomeData()
        // No set method providing array access
        // Therefore no accidental usage of `put`
        // config["override"] = "stuff"
    }
}

private val random = Random()

fun goGetSomeData(): Map<String, String> {
    // Arbitrary complex config where sometimes the value comes from a default Map.of(...), sometimes from another construct.
    if (random.nextFloat() > 0.5f) {
        return mapOf("preset" to "value")
    } else {
        // build this somehow by parsing a file or whatever
        val config: MutableMap<String, String> = HashMap()
        config["key"] = "value"
        return config
    }
}
