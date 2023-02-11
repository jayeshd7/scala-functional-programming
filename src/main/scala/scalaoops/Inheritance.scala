package scalaoops

object Inheritance extends App{

  sealed class Animal {
    val creatureType = "wild"
    def eat = println("I am eating")

  }
  class Dog extends Animal {
    override def eat = println("I am eating dog food")

  }
  val Dog = new Dog
  Dog.eat

  // extending a class with a constructor
    class Person(name: String, age: Int) {
        def this(name: String) = this(name, 0)

    }

    // overriding a constructor
    class Adult(name: String, age: Int, idCard: String) extends Person(name) {

    }

    class Cat(catType:String) extends Animal {
      // super not allowed on val or var super.creatureType
      override val creatureType = catType
      override def eat = {
                super.eat
                println("I am eating cat food")
            }
    }
    val cat = new Cat("k9")
    cat.eat
    println(cat.creatureType)

    // type substitution (broad: polymorphism)
    val unknownAnimal: Animal = new Cat("k9")
    unknownAnimal.eat

    // preventing override
    // 1 - use final on member
    // 2 - use final on the entire class
    // 3 - seal the class = extend classes in THIS FILE, prevent extension in other files

}
