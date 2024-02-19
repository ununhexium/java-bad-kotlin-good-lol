package yava.bad.kotlin.good.lol.multiplylists

// Some object with lots of fields
data class Room(val travellerIds: List<Int>)

fun callService(): List<Room> {
    return java.util.List.of(Room(listOf(1,7,116)))
}