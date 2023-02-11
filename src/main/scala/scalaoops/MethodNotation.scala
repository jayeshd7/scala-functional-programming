package scalaoops

import scala.language.postfixOps

object MethodNotation extends App{


  class Person(val name:String, favMovie:String, val age:Int = 0){
    def likes(movie:String):Boolean = movie == favMovie
    def hangOutWith(person:Person):String = s"${this.name} is hanging out with ${person.name}"

    def +(nickName: String): Person = new Person(s"$name ($nickName)", favMovie)
    def unary_! : String = s"$name, what the heck?!" // space with unary_ is mandatory
    def unary_+ : Person = new Person(name, favMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favMovie and my age is $age"

    def apply(n:Int): String = s"name watch $favMovie $n times"

    def learns(thing:String): String = s"$name learns $thing"

    def learnScala = this learns "Scala" // equivalent with learns("Scala"


  }
    val mary = new Person("Mary","Inception")
    println(mary.likes("Inception"))
    println(mary likes "Inception") // infix notation = operator notation (syntactic sugar)
    println(mary learns("java"))
    // only single parameter methods can be used with infix notation
    val tom = new Person("Tom","Fight Club")
    println(mary hangOutWith tom)
    println(!mary)
    println(mary.unary_!)


    // prifix notation
    val x = -1 // equivalent with 1.unary_-
    val y = 1.unary_-
    // unary_ prefix only works with - + ~ !

    println(y)

    // postfix notation
    println(mary.isAlive)
    println(mary isAlive)

    // special method name apply
    println(mary.apply())
    // trick

    println(mary()) // equivalent with mary.apply()
    println((mary + "the rockstar")())
    println((mary + "the rockstar").apply())
    println((mary unary_+)())
    println((+mary).age)
    //println(mary learns("scala"))

    println(mary learnScala)

    print(mary(10))
}
