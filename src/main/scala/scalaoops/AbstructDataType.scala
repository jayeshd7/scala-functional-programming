package scalaoops

object AbstructDataType extends App {

  // Abstruct

  abstract class Animal {
    val createType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val createType: String = "Dog"
    def eat: Unit = println("Dog is eating")
  }
  val Dog = new Dog
  Dog.eat
  println(Dog.createType)

  // traits

  trait Carnivore(name: String) {
    def eat: Unit = println(s"I am a $name and I am eating")
    def eat(animal: Animal): Unit
  }




  trait ColdBlooded

  class Crocodile extends Animal with Carnivore("dog") with ColdBlooded {
    override val createType: String = "Crocodile"
    override def eat: Unit = println("Crocodile is eating")
    override def eat(animal: Animal): Unit = println(
      s"I am a crocodile and I am eating ${animal.createType}"
    )
  }

  private val crocodile = new Crocodile
  crocodile.eat(Dog)
  crocodile.eat

  // traits vs abstract classes
    // 1 - traits do not have constructor parameters (scala 3 will have)
    // 2 - multiple traits may be inherited by the same class
    // 3 - traits = behavior, abstract class = "thing"

}
