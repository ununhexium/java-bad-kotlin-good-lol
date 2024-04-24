package yava.bad.kotlin.good.lol.russianroulette;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

public class RussianRoulette {
    public static void main(String[] args) {
        /*
         * Java makes no difference between mutable and immutable collections,
         * leading to unexpected exceptions.
         */
        IntStream.range(0, 100).forEach(it -> {
            Map<String, String> config = goGetSomeData();
            try {
                config.put("override", "stuff");
            } catch (UnsupportedOperationException e) {
                System.out.println("Attempt " + it + " failed");
            }
        });
    }

    private static final Random random = new Random();

    public static Map<String, String> goGetSomeData() {
        // Arbitrary complex config where sometimes the value comes from a default Map.of(...), sometimes from another construct.
        if (random.nextFloat() > 0.5f) {
            return Map.of("preset", "value");
        } else {
            // build this somehow by parsing a file or whatever
            Map<String, String> config = new HashMap<>();
            config.put("key", "value");
            return config;
        }
    }
}
