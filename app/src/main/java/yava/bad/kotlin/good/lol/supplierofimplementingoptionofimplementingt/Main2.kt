package yava.bad.kotlin.good.lol.supplierofimplementingoptionofimplementingt

fun main() {
    simple()
    complete()
}

interface Base
interface Ext : Base

fun simple() {
    val stuff: Base? = null
    val orElse = object : Ext {}

    val result = stuff ?: orElse
}

private fun complete() {
    val stuff: Base? = null
    val orElse = object : Ext {}

    // and even if we wanted to write the same function definition, it's much simpler
    // public Optional<T> or(@NotNull Supplier<? extends Optional<? extends T>> supplier) {
    fun <T : Any, R : T> T?.or(other: () -> R): T =
            this ?: other()

    val result2 = stuff.or { orElse }

    /*
     * Original
     *
     * public Optional<T> or(Supplier<? extends Optional<? extends T>> supplier) {
     *         Objects.requireNonNull(supplier);
     *         if (isPresent()) {
     *             return this;
     *         } else {
     *             @SuppressWarnings("unchecked")
     *             Optional<T> r = (Optional<T>) supplier.get();
     *             return Objects.requireNonNull(r);
     *         }
     *     }
     */

    // same function, compared to java's features
    // public
    fun
    // make it explicitly non-null instead of relying on runtime checks
            <T : Any>
    // This is now "better" because we can call it on non-nullable objects too, not only the optional ones, but useless for this scenario
            T?
    // or(
            .or2(other: () -> T // Objects.requireNonNull(supplier); Now at compile time
    ):
    // this function explicitly returns something that is not null. Let's tell the dev about it!!
    // I assume that it is done differently in Java (using Optional) to allow the chaining of operations, which is natively supported in Kotlin
    // Optional<T> (that is never empty)
            T =
            // if (isPresent()) { return this
            this
            // } else {
                    ?:
                    // safe in Kotlin, compile-time checked, no need for this BS
                    // @SuppressWarnings("unchecked")
                    // Optional<T> r = (Optional<T>) supplier.get();
                    // return Objects.requireNonNull(r);
                    other()

}
