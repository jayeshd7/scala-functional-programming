package playground

object Function extends  App {

  def aFunction(a:String, b:Int): String ={
    a + " " + b
  }

  println(aFunction("Hello", 3))


  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " " + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Hello", 3))

  def aFunctionSideEffect(aString: String): Unit = println(aString)

  aFunctionSideEffect("Hello")

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = {
      a+b
    }


    aSmallerFunction(n, n - 1)
  }
  aBigFunction(5)



  private def isPrime(n:Int):Boolean = {
    def isPrimeUntil(t:Int):Boolean = {
      if(t<=1) true
      else n%t != 0  && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }
  println(isPrime(37))
  println(isPrime(6))


}
