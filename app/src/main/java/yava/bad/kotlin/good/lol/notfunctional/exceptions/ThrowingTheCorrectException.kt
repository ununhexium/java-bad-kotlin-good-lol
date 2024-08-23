package yava.bad.kotlin.good.lol.notfunctional.exceptions

class ExistingException : Exception()

fun main() {
    val parse = { s: String ->
        try {
            s.toInt()
        } catch (e: NumberFormatException) {
            throw ExistingException();
        }
    }

    runCatching {
        someFunctionWithCallback("xyz", parse)
    }.onFailure {
        it.printStackTrace()
    }
}

fun someFunctionWithCallback(s: String, f: (String) -> Int): Int {
    // nope
    return f(s)
}
