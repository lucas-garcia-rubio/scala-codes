import scala.collection.mutable.ListBuffer
import scala.util.Random.nextInt

/*
Lotto: Draw N different random numbers from the set 1..M.
Example:
scala> lotto(6, 49)
res0: List[Int] = List(23, 1, 17, 33, 21, 37)
 */

object p24 extends App{

  def lotto(n: Int, m: Int): List[Int] = {

    val buff = ListBuffer[Int]()

    for (i <- 0 until n) {
      buff += nextInt(m)
    }

    buff.toList
  }

  println(lotto(6, 49))
}
