/*
Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
 */

object p02 {
  def penultimate(l: List[Int]): Int = l match {
    case List(x, _) => x
    case _ :: tail  => penultimate(tail)
    case _          => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    println(penultimate(List(1, 1, 2, 3, 5, 8)))
  }
}
