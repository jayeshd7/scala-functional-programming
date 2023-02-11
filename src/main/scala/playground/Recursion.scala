package playground

import scala.annotation.tailrec

object Recursion extends App{

  private def anotherRecursion(n: Int): BigInt = {
    if(n <= 1) 1
    else n * anotherRecursion(n-1)

  }

    //println(anotherRecursion(5000))


    //tail recursion
    //use @tailrec annotation
    //use recursive call as the LAST expression
    //compiler will optimize the code
    //no need for extra data structures

    def fastRecursion(n:Int): BigInt = {
      @tailrec
      def factHelper(x: Int, accumulator: BigInt): BigInt = {
        if(x <= 1) accumulator
        else factHelper(x-1, x * accumulator)
      }
      factHelper(n, 1)
    }

    println(fastRecursion(5000))

    @tailrec
    def concatString(aString:String, n:Int, accumulator:String): String = {
      if(n <= 0) accumulator
      else concatString(aString, n-1, aString + accumulator)
    }
    println(concatString("hello", 3, " "))


    def isPrime(n: Int): Boolean = {
      @tailrec
      def isPrimeUntil(t: Int, isStillPrime: Boolean): Boolean = {
        if(!isStillPrime) false
        else if(t <= 1) true
        else isPrimeUntil(t-1, n % t != 0 && isStillPrime)
      }
      isPrimeUntil(n/2, true)
    }

    def fibonaci(n:Int):Int = {
      @tailrec
        def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int = {
            if(i >= n) last
            else fiboTailrec(i+1, last + nextToLast, last)
        }
        if(n <= 2) 1
        else fiboTailrec(2, 1, 1)
    }
    println(fibonaci(8))

    def callByName(n: => Int): Int = n + n + n + 1

    println(callByName(2))


    def defulatFactorial(n:Int, accumulator: Int = 1): Int = {
      if(n <= 1) accumulator
      else defulatFactorial(n-1, n * accumulator)
    }
    println(defulatFactorial(5))
}
