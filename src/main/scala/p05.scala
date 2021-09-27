/*
Reverse a list.
Example:
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
 */

object p05 {

  def reverse[A](l: List[A]): List[A] = l match {
    case Nil        => Nil
    case x :: tail  => reverse(tail) ::: List(x)
  }

  def main(args: Array[String]): Unit = {
    println(reverse(List(1, 1, 2, 3, 5, 8)))
  }
}
