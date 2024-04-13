package yava.bad.kotlin.good.lol.atomizethem

import java.util.function.Consumer

fun main() {
  var saved = 0
  doStuff { saved = it }
}


fun doStuff(callback: (Int) -> Unit) {
  // do something then inform about the caller
  callback(42)
}
