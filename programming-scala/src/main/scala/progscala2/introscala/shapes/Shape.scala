package progscala2.introscala.shapes

/**
 * Created by z00194c on 12/3/15.
 */
abstract class Shape() {
  def draw(f: String => Unit): Unit = f(s"draw: ${this.toString}")
}
