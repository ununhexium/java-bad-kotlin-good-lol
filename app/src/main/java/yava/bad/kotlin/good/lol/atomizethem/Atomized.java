package yava.bad.kotlin.good.lol.atomizethem;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;

public class Atomized {
    public static void main(String[] args) {
        var saved = new AtomicInteger(0);
        doStuff(saved::set);
    }

    public static void doStuff(Consumer<Integer> callback) {
        // do something then inform about the caller
        callback.accept(42);
    }
}
