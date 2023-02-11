package scalaoops

object ObjectScala  {

  def main(args: Array[String]): Unit = {
    val mary = new Person("Mary")
    val john = new Person("John")

    println(mary.hashCode() == john.hashCode())

    val bobbie = Person(mary, john)
    println(bobbie.name)

    // Scala Applications = Scala object with
    // def main(args: Array[String]): Unit
  }

  // SCALA DOESN'T HAVE CLASS LEVEL FUNCTIONALITY ("static")
    // 1. In Scala, you define singleton objects instead of "static" methods and fields
    // 2. Scala singleton objects are in their own class
    // 3. Scala singleton objects are the only instance of their own definition
    // 4. Scala singleton objects are created lazily when they are referenced
    // 5. Scala singleton objects cannot take parameters
    // 6. Scala singleton objects are defined using the object keyword

    object Person {
      val N_EYES = 2
      def canFly: Boolean = false
      // factory method
      def apply(mother: Person, father: Person): Person = new Person("Bobbie")


    }
    class Person(val name :String) {
        // instance level functionality
    }

    // COMPANIONS
    // Scala objects and classes can be defined in the same scope
    // They are called companions
    // They can access each other's private members


    println(Person.N_EYES)
    println(Person.canFly)

}

