package yava.bad.kotlin.good.lol.notfunctional;

import java.util.function.*;

interface IfMoreThan2Inputs<A, B, C, R> {
    R apply(A a, B b, C c);
}

public class WhoIsWho {
    public static void main(String[] args) {
        BiConsumer<Object, Object> biConsumer = (o1, o2) -> {};
        BiFunction<Object, Object, Object> biFunction = (o1, o2) -> new Object();
        BinaryOperator<Object> binaryOperator = (o1, o2) -> new Object();
        BiPredicate<Object, Object> biPredicate = (o1, o2) -> true;
        BooleanSupplier booleanSupplier = () -> true;
        Consumer<Object> consumer = (o) -> {};
        Function<Object, Object> function = (o) -> new Object();
        Predicate<Object> predicate = (o) -> true;
        Supplier<Object> supplier = () -> true;
        UnaryOperator<Object> unaryOperator = (o) -> new Object();
        Runnable runnable = () -> {};

        DoubleBinaryOperator doubleBinaryOperator = (d1, d2) -> 1.0;
        DoubleConsumer doubleConsumer = (d) -> {};
        DoubleFunction<Object> doubleFunction = (d) -> new Object();
        DoublePredicate doublePredicate = (d) -> true;
        DoubleSupplier doubleSupplier = () -> 1.0;
        DoubleToIntFunction doubleToIntFunction = (d) -> 1;
        DoubleToLongFunction doubleToLongFunction = (d) -> 1L;
        DoubleUnaryOperator doubleUnaryOperator = (d) -> 1.0;

        IntBinaryOperator intBinaryOperator = (i1, i2) -> 1;
        IntConsumer intConsumer = (i) -> {};
        IntFunction<Object> intFunction = (i) -> new Object();
        IntPredicate intPredicate = (i) -> true;
        IntSupplier intSupplier = () -> 1;
        IntToDoubleFunction intToDoubleFunction = (i) -> 1.0;
        IntToLongFunction intToLongFunction = (i) -> 1L;
        IntUnaryOperator intUnaryOperator = (i) -> 1;

        LongBinaryOperator longBinaryOperator = (l1, l2) -> 1L;
        LongConsumer longConsumer = (l) -> {};
        LongFunction<Object> longFunction = (l) -> new Object();
        LongPredicate longPredicate = (l) -> true;
        LongSupplier longSupplier = () -> 1L;
        LongToDoubleFunction longToDoubleFunction = (l) -> 1.0;
        LongToIntFunction longToIntFunction = (l) -> 1;
        LongUnaryOperator longUnaryOperator = (l) -> 1L;

        ObjDoubleConsumer<Object> objDoubleConsumer = (o, d) -> new Object();
        ObjIntConsumer<Object> objIntConsumer = (o, i) -> new Object();
        ObjLongConsumer<Object> objLongConsumer = (o, l) -> new Object();
        ToDoubleBiFunction<Object, Object> toDoubleBiFunction = (o1, o2) -> 1.0;
        ToDoubleFunction<Object> toDoubleFunction = (o) -> 1.0;
        ToIntBiFunction<Object, Object> toIntBiFunction = (o1, o2) -> 1;
        ToIntFunction<Object> toIntFunction = (o) -> 1;
        ToLongBiFunction<Object, Object> toLongBiFunction = (o1, o2) -> 1L;
        ToLongFunction<Object> toLongFunction = (o) -> 1L;

        // if you need more than 2 inputs, a new declaration is needed.
        IfMoreThan2Inputs<Object, Object, Object, Object> threeInputs = (o1, o2, o3) -> new Object();

        Lib1<Integer> operation = (it) -> it;
        // Can't do that even though they have the exact same signature.
        // call(operation);
    }

    public static void call(Lib2<Integer> f) {
        f.apply(1);
    }
}
