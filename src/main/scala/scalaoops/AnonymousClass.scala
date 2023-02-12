package scalaoops

object AnonymousClass extends App{

  abstract class Animal {
    def eat: Unit = println("I am eating")
  }

  //anonymous class
  val funnyAnimal: Animal = new Animal{
    override def eat: Unit = println("I am eating funny")
  }
  /*
    equivalent with
    class AnonymousClasses$$anon$1 extends Animal{
      override def eat: Unit = println("I am eating funny")
    }

  val funnyAnimal: Animal = new AnonymousClasses$$anon$1
  */

  class Person(name:String) {
    def sayHi:Unit = println(s"Hi, my name is $name, how can I help ?")
  }
  val jim = new Person("jayesh"){
    super.sayHi
    override def sayHi: Unit = println(s"Hi, my name is jim , how can I help ?")
  }
  println(jim.sayHi)
  println(funnyAnimal.getClass)
  println(funnyAnimal.eat)

}
