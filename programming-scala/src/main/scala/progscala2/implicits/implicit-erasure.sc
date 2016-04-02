object M {
  implicit object IntMarker
  implicit object StringMarker

  def m(seq: Seq[Int])(implicit i: IntMarker.type): Unit = println(s"Seq[Int]: $seq")
  def m(seq: Seq[String])(implicit i: StringMarker.type): Unit = println(s"Seq[String]: $seq")
}

import M._

m(List(1,2,3))
m(List("one", "two", "three"))