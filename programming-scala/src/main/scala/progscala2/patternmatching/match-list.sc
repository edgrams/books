val nonEmptyList = List(1, 2, 3, 4, 5)
val emptyList = Nil

def listToString[T](list: List[T]): String = list match {
  case head :: tail => s"($head :: ${listToString(tail)})"
  case Nil => "(Nil)"
}

for (i <- List(nonEmptyList, emptyList)) println(listToString(i))
