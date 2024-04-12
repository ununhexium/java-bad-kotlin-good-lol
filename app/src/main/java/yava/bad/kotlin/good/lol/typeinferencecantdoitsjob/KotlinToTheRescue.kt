package yava.bad.kotlin.good.lol.typeinferencecantdoitsjob

fun main() {
    // automatically List<Map<String, List<String>>>
    val ex = listOf(
            mapOf(),
            mapOf(
                    "limit" to listOf("10"),
                    "filter" to listOf("a", "b", "c")
            )
    );
}