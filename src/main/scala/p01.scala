/*
Find the last element of a list.
Example:
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
 */

object p01 {
  def last(l: List[Int]): Int = {
    l.last
  }

  def lastRecursive(l: List[Int]): Int = l match {
    // case List(x)    => x
    case x :: Nil   => x
    case _ :: tail  => lastRecursive(tail)
    case _          => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    println(lastRecursive(List(1, 1, 2, 3, 5, 8)))
  }
}
