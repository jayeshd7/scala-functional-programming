package scalaoops

object GenericConcept extends App{

  class MyList[+A]{
    // use the type A
    def add[B >:A](element:B):MyList[B] = ???

    /*
    A - Cat
    B - Animal

    resultant list should be MyList[Animal]
    */

  }
  class MyMap[key,value]
  val myList = new MyList[Int]
  val myMap = new MyMap[String,Int]

  trait MyTrait[T]
  val myTrait = new MyTrait[Int] {}

    trait MyTrait2[T]{
        def apply(t:T):Unit
    }
    val myTrait2 = new MyTrait2[Int] {
        override def apply(t: Int): Unit = println(t)
    }
    println(myTrait2(10))


  object MyList {
    def empty[T]: MyList[T] = ??? // factory method

  }
    val emptyList = MyList.empty[Int]


    // variance problem


    class Animal
    class Cat extends Animal
    class Dog extends Animal

    // 1. yes List[Cat] extends List[Animal] = COVARIANCE
    class CovariantList[+A]

    val animal: Animal = new Cat
    val animalList: CovariantList[Animal] = new CovariantList[Cat]
    //animalList.add(new Dog) // ??? HARD QUESTION => we return a list of animals

    // 2. NO = INVARIANCE
    class InvariantList[A]
    val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

    // 3. Hell, no! CONTRAVARIANCE
    class Trainer[-A]
    val trainer : Trainer[Cat] = new Trainer[Animal]

    // bounded types

    class Cage[A <: Animal](animal: A)

    val cage = new Cage(new Dog)

    class Car
    //val newCage = new Cage(new Car)


    


}
