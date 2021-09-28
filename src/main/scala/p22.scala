/*
Create a list containing all integers within a given range.
Example:
scala> range(4, 9)
res0: List[Int] = List(4, 5, 6, 7, 8, 9)
 */

object p22 extends App {

  def range(i: Int, j: Int): List[Int] = {
    List.range(i, j+1)
  }

  println(range(4, 9))
}
