package yava.bad.kotlin.good.lol.notfunctional

typealias in2 = (o1: Any, o2: Any) -> Any
typealias in1 = (o1: Any) -> Any
typealias in0 = () -> Any

fun main() {
  /*
   * 1 notation to rule them all
   * (InputType1, InputType2, InputType3, ...) -> OutputType
   */

  val biConsumer: in2 = { o1, o2 -> }
  val biFunction: in2 = { o1, o2 -> Any() }
  val binaryOperator: in2 = { o1, o2 -> Any() }
  val biPredicate: in2 = { o1, o2 -> true }
  val booleanSupplier: () -> Boolean = { true }
  val consumer: in1 = {}
  val function: in1 = { it }
  val predicate: in1 = { true }
  val supplier: in0 = { Any() }
  val unaryOperator: in1 = { it -> Any() }
  val runnable: in0 = {/* do stuff here */ }

  val threeInputs: (Any, Any, Any) -> Any = { a, b, c -> Any() }
  val threeInputs2 = { a: Any, b: Any, c: Any -> Any() }
}
