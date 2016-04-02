package progscala2.introscala

/**
 * Created by z00194c on 2/14/16.
 */

object Upper {
  def main(args: Array[String]) = {
    args.map(_.toUpperCase()).foreach(printf("%s ", _))
    println("")
  }
}
