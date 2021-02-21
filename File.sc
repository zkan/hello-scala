val fileInfo = os
  .list(os.pwd)
  .map{ f =>
    println(s"$f")
  }
