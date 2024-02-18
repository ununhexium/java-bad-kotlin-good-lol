package yava.bad.kotlin.good.lol.multiplylists;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.IntStream;

public class FlatMapRooms {
    public static void main(String[] args) {
        int count = 5;

        List<Room> singleRoom = callService();

        // fake having multiple rooms
        List<Room> rooms = IntStream.rangeClosed(1, count)
                .boxed()
                .flatMap(it -> singleRoom.stream())
                .toList();

        System.out.println(rooms.size());
    }

    @NotNull
    private static List<Room> callService() {
        return List.of(new Room(List.of(7)));
    }
}
