import scala.collection.mutable.ListBuffer
import scala.util.Random.nextInt

/*
Extract a given number of randomly selected elements from a list.
Example:
scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
res0: List[Symbol] = List('e, 'd, 'a)
 */

object p23 extends App {

  def randomSelect(n: Int, l: List[Symbol]): List[Symbol] = {

    var buff = l.to[ListBuffer]

    for (i <- 0 to n) {
      buff -= buff(nextInt(buff.length))
    }

    buff.toList
  }

  println(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))

}
