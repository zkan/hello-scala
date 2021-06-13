
object HelloWorld {
  def multipliedByTwo(x: Int): Int = if (x == 0) x else x * 2

  def multipliedByTen(x: Double = 10, y: Double): Double = {
      x * y
  }

  def greeting(): Unit = println("Hello!")

  def factorial(x: Int): Int = {
    if (x == 0 || x == 1)
      x
    else
      x * factorial(x - 1)
  }

  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  private def formatAbs(x: Int) = {
    val msg = "This absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def myFactorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

  def fib(n: Int): Int = {
    def go(n: Int, a: Int, b: Int): Int =
      if (n == 0) a
      else if (n == 1) b
      else go(n - 1, b, a + b)

    go(n, 0, 1)
  }

  def findFirst(ss: Array[String], key: String): Int = {
    def loop(n: Int): Int =
      if (n >= ss.length) -1
      else if (ss(n) == key) n
      else loop(n + 1)

    loop(0)
  }

  def findFirstAbstract[A](as: Array[A], p: A => Boolean): Int = {
    def loop(n: Int): Int = {
      if (n >= as.length) -1
      else if (p(as(n))) n
      else loop(n + 1)
    }

    loop(0)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def loop(n: Int): Boolean = {
      if (n == as.length - 1) true
      else if (ordered(as(n), as(n + 1))) loop(n + 1)
      else false
    }

    loop(0)
  }

  def main(args: Array[String]): Unit = {
    println("Hello World")
    greeting()
    println(multipliedByTwo(5))
    println(multipliedByTen(y=9))
    println(factorial(5))

    // immutable inclusive range
    for (i <- 1 to 10) println(i)
    println("-----")

    // immutable exclusive range
    for (i <- 1 until 10) println(i)
    println("-----")

    // use guard
    for (i <- 1 until 10 if i % 2 == 0) println(i)
    println("-----")

    val age = 20
    age match {
      case 10 => println("ten")
      case 20 => println("twenty")
      case _  => println("Did not find a match")
    }

    println(formatAbs(-42))
    println(myFactorial(5))
    println(fib(9))

    val ss: Array[String] = Array("Hello", "World", "Scala")
    val key: String = "Scala"
    var result: Int = findFirst(ss, key)
    println(result)

    val as: Array[Int] = Array(1, 9, 3, 4, 0)
    val keyInt: Int = 9
    result = findFirstAbstract[Int](as, (x: Int) => x == keyInt)
    println(result)

    val someArray: Array[Int] = Array(1, 2, 3, 6, 8, 9, 10, 7)
    val isSortedResult: Boolean = isSorted[Int](someArray, (x: Int, y: Int) => x <= y)
    println(isSortedResult)

  }
}
