package progscala2.rounding

/**
 * Created by z00194c on 2/19/16.
 */
object TryCatch {
  def main(args: Array[String]) = {
    args foreach (arg => countLines(arg))
  }

  import scala.io.Source
  import scala.util.control.NonFatal

  def countLines(fileName: String) = {
    println()
    var source: Option[Source] = None

    try {
      source = Some(Source.fromFile(fileName))

      val size = source.get.getLines.size
    } catch {
      case NonFatal(ex) => println(s"Non fatal exception! $ex")
    } finally {
      for (s <- source) {
        println(s"Closing $fileName...")
        s.close
      }
    }
  }
}
