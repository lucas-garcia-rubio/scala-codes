/*
 Find the number of elements of a list.
Example:
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
 */

// Let's try without using .lenght
object p04 {

  def length[A](l: List[A], n: Int = 0): Int = l match {
    case _ :: Nil   => n+1
    case _ :: tail  => length(tail, n+1)
    case _          => throw new NoSuchElementException
  }


  def main(args: Array[String]): Unit = {
    println(length(List(1, 1, 2, 3, 5, 8, 13)))
  }
}
