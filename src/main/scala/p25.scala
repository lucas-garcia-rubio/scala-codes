import scala.collection.mutable.ListBuffer
import scala.util.Random.nextInt

/*
Generate a random permutation of the elements of a list.
Hint: Use the solution of problem P23.
Example:

scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
 */

object p25 extends App {

  def randomPermute(l: List[Symbol]): List[Symbol] = {

    val buff1 = l.to[ListBuffer]
    val buff2 = ListBuffer[Symbol]()

    for (i <- l.indices) {
      buff2 += buff1.remove(nextInt(buff1.length))
    }

    buff2.toList
  }

  println(randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)))

}
