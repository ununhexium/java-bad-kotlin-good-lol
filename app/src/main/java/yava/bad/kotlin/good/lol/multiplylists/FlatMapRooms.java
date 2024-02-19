package yava.bad.kotlin.good.lol.multiplylists;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.IntStream;

import static yava.bad.kotlin.good.lol.multiplylists.StuffKt.callService;

public class FlatMapRooms {
    public static void main(String[] args) {
        int count = 5;

        List<Room> singleRoom = callService();

        // fake having multiple rooms if any room exists at all
        List<Room> rooms = IntStream.rangeClosed(1, count)
                .boxed()
                .flatMap(it -> singleRoom.stream())
                .toList();

        // "format" it a bit
        System.out.println(
                String.join(
                        " / ",
                        rooms.stream()
                                .map(Room::getTravellerIds)
                                .map(it ->
                                        String.join(", ",
                                                it.stream().map(String::valueOf).toList())).toList())
        );
    }
}
