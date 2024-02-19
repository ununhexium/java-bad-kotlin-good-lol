package yava.bad.kotlin.good.lol.inconsistentstreams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InconsistentStreams {

    private static int ADULT_CONSTANT_AGE = 25;
    public static void main(String[] args) {
        List<Integer> childrenAges = List.of(2,5,17);
        int adultCount = 3;

        // nope: IntStream VS Stream<Integer>
//        List<Integer> allAges = Stream.concat(
//                IntStream.range(0, adultCount).map(it -> ADULT_CONSTANT_AGE),
//                childrenAges.stream()
//        );

        // yes
        List<Integer> allAges = Stream.concat(
                IntStream.range(0, adultCount).map(it -> ADULT_CONSTANT_AGE).boxed(), // needs boxed
                childrenAges.stream()
        ).toList();
    }
}
