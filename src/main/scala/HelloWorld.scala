
object HelloWorld {
  def multipliedByTwo(x: Int): Int = if (x == 0) x else x * 2

  def multipliedByTen(x: Double = 10, y: Double): Double = {
      x * y
  }

  def main(args: Array[String]): Unit = {
    println("Hello World")
    println(multipliedByTwo(5))
    println(multipliedByTen(y=9))
  }
}
