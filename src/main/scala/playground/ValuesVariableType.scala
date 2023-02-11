package playground

object ValuesVariableType extends  App{

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE
  // COMPILER CAN INFER TYPES

  val aString: String = "Hello"
  val anotherString = "Goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'

  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 5273623623623623623L

  val aFloat: Float = 2.0f

  val aDouble: Double = 3.14

  //variables
  var aVariable: Int = 4

  aVariable = 5 //side effects

  println(aVariable)

}
