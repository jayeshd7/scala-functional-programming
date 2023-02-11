package playground

object StringOps extends App{

  val str: String = "Hello, I am learning Scala"
  println(str.charAt(2))

  println(str.substring(7,11))

  println(str.trim())
  println(str.split(" ").toList)
  println(str.length())
  println(str.toCharArray().toList)


  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(aNumber)
  println(str.reverse)
  println(str.take(2))

  // scala specific: String interpolators
  // S-interpolators
    val name = "David"
    val age = 12
    val greeting = s"Hello, My nae is $name and I am $age years old"
    val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old"
    println(greeting)
    println(anotherGreeting)

// F-interpolators
//
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"

  // f is interpolation sting , $ expand value, %s defines the string , %2.2f defines the float 2 character with 2 decimal
  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")


}
