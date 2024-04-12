package yava.bad.kotlin.good.lol.nonullinlists

fun main() {
    // happy
    val l1 = listOf(1,null)

    // happy, automatically delegates to singletonList
    val l2 = listOf(null)

    // that's it, all the cases are covered

    println(l1)
    println(l2)
}