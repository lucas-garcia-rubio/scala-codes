/*
Insert an element at a given position into a list.
Example:
scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
 */

object p21 extends App {

  def insertAt(s: Symbol, n: Int, l: List[Symbol]): List[Symbol] = {
    val (beginning, ending) = l.splitAt(n)
    beginning ::: List(s) ::: ending
  }

  println(insertAt('new, 1, List('a, 'b, 'c, 'd)))

}
