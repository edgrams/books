def checkY(y: Int) = {
  for {
    x <- Seq(99, 100, 101)
  } {
    val str = x match {
      case `y` => println("found y!")
      case i: Int => println("int: " + i)
    }
  }
}

checkY(100)