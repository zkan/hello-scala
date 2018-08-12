
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

  def main(args: Array[String]): Unit = {
    println("Hello World")
    greeting()
    println(multipliedByTwo(5))
    println(multipliedByTen(y=9))
    println(factorial(5))
  }
}
