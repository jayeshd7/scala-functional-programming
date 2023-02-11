package playground

import playground.ValuesVariableType.aVariable

object Expression extends App {

  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3
  println(aConditionValue)

// NEVER WRITE THIS AGAIN
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

// EVERYTHING IN SCALA IS AN EXPRESSION
  private val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  private val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
  println(aCodeBlock)

  private val sameValue = {
     3<2
  }

  println(sameValue)

  val someAnotherValue = {
    if (sameValue) 239 else 986
    42
  }

  println(someAnotherValue)
}
