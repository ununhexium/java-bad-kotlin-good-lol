package yava.bad.kotlin.good.lol.notfunctional

typealias in2 = (o1: Any, o2: Any) -> Any
typealias in1 = (o1: Any) -> Any
typealias in0 = () -> Any

interface Forced<T> {
    operator fun invoke(t: T): T // analog to (T) -> T
}

fun interface Lib1Kt<T> : (T) -> T

fun interface Lib2Kt<T> : (T) -> T

fun interface Lib3Kt<T> {
    fun weirdName(t: T): T
}

fun main() {
    /*
     * 1 notation to rule them all
     * (InputType1, InputType2, InputType3, ...) -> OutputType
     */

    val biConsumer: (Any, Any) -> Unit = { o1, o2 -> }
    val biFunction: in2 = { o1, o2 -> Any() }
    val binaryOperator: in2 = { o1, o2 -> Any() }
    val biPredicate: (Any, Any) -> Boolean = { o1, o2 -> true }
    val booleanSupplier: () -> Boolean = { true }
    val consumer: (Any) -> Unit = {}
    val function: (Any) -> Any = { it }
    val predicate: (Any) -> Boolean = { true }
    val supplier: () -> Any = { Any() }
    val unaryOperator: (Any) -> Any = { it -> Any() }
    val runnable: () -> Unit = {/* do stuff here */ }

    someMoreRealLifeExamples()

    val threeInputs: (Any, Any, Any) -> Any = { a, b, c -> Any() }
    val threeInputs2 = { a: Any, b: Any, c: Any -> Any() }

    val operation1: Lib1Kt<Int> = Lib1Kt { it + 1 }
    val operation = { it: Int -> it + 1 }
    // works!
    callAny(operation1)
    callLib1(operation1)
    callLib2(operation1)

    callAny(operation)
    callLib1(operation)
    callLib2(operation)


    // can force a specific interface
    val force = object : Forced<Int> {
        override fun invoke(t: Int): Int = t + 1
    }
    forced(force)
    // not accepted
    // forced(operation1)

    // doesn't work in the interface doesn't comply to a functional interface
    val weirdOperation = Lib3Kt<Int> { it + 1 }
    //  callAny(weirdOperation)
    //  callLib1(weirdOperation)
    //  callLib2(weirdOperation)
}

fun someMoreRealLifeExamples() {
    val list1 = 0..10
    // java: Function
    val selector: (Int) -> Boolean = { it % 2 == 0 }
    println(list1.groupBy(selector))
    // or just
    println(list1.groupBy { it % 2 == 0 })

    val list2 = 0..10L
    // java: LongToDoubleFunction
    val longToDouble: (Long) -> Double = { it.toDouble() }
    println(list2.map(longToDouble))
    // or just
    println(list2.map { it.toDouble() })

    class A
    class B
    class C

    val shoppingList = listOf(
            // Item to Amount
            A() to 2,
            B() to 5,
            C() to 3
    )
    val prices = mapOf(A::class to 7.99, B::class to 1.99, C::class to 129.99)
    val sumByItem: (Pair<Any, Int>) -> Double = { (obj, amount) -> prices[obj::class]!! * amount }
    val total = shoppingList.map(sumByItem).sum()
    println(total)
}

fun callAny(f: (Int) -> Int) =
        f(1)

fun callLib1(f: Lib1Kt<Int>) =
        f(1)

fun callLib2(f: Lib2Kt<Int>) =
        f(1)

fun forced(f: Forced<Int>) {
    // can still be called like a function
    f(1)
    // or like an interface
    f.invoke(1)
}
