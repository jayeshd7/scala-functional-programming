package scalaoops

object OOBasic extends App{

   val person = new Person(name = "jayesh", age = 33)
    person.sayHello("pooja", 33)
    person.greet("pooja")

    val author = new Writer("Jayesh", "dalal", 1987)
    val novel = new Novel("Scala", 2019, author)
    println(novel.authorAge())
    println(novel.isWrittenBy(author))
    val newNovel = novel.copy(2020)
    println(newNovel.authorAge())

    val counter = new Counter
    counter.inc.inc.print

    counter.inc(10).print


}
// constructor
class Person(val name: String, val age: Int = 0) {
  // body


  // method
  def sayHello(name :String, age:Int): Unit = println(s"Hello, my name is ${this.name} and I am ${this.age} years old")

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // class parameters are NOT FIELDS


  // Mutliple constructors primary and auxiliary

    def this(name: String) = this(name, 0)
    def this() = this("John Doe")
}


class Writer(val fName:String, val lName:String, val year: Int){
    def fullName(): String = fName + " " + lName

}

class Novel(val name :String, val year:Int, val author: Writer){
    def authorAge(): Int = year - author.year
    def isWrittenBy(author: Writer): Boolean = author == this.author
    def copy(newYear: Int): Novel = new Novel(name, newYear, new Writer(author.fName, author.lName, author.year))
}


class Counter(val count:Int =0){
    def inc = {
      println("incrementing")
      new Counter(count + 1)
    }
    def dec = {
        println("decrementing")
      new Counter(count - 1)
    }
    def inc(n:Int): Counter = {
        if(n <= 0) this
        else inc.inc(n - 1)
    }
    def dec(n:Int): Counter = {
        if(n <= 0) this
        else dec.dec(n - 1)
    }
    def print = println(count)
}
