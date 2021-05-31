
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
  }
}
