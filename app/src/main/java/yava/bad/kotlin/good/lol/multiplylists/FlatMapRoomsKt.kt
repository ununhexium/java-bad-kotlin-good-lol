package yava.bad.kotlin.good.lol.multiplylists

object FlatMapRoomsKt {
    @JvmStatic
    fun main(args: Array<String>) {
        val count = 5

        val singleRoom = callService()

        // fake having multiple rooms
        val rooms = List(count) { singleRoom }.flatten()
        println(rooms.size)
    }

    private fun callService(): List<Room> {
        return java.util.List.of(Room(listOf(7)))
    }
}
