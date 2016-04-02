package progscala2.introscala

/**
 * Created by z00194c on 2/14/16.
 */
object Upper2 {
  def main(args: Array[String]) = {
    val output = args.map(_.toUpperCase()).mkString(" ")
    println(output)
  }
}
