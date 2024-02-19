package yava.bad.kotlin.good.lol.multiplylists

fun main(args: Array<String>) {
    val count = 5

    val singleRoom = callService()

    // fake having multiple rooms
    val rooms = List(count) { singleRoom }.flatten()

    // "format" it a bit
    println(
        rooms.joinToString(" / ") {
            it.travellerIds.joinToString(", ") { it.toString() } }
    )
}
