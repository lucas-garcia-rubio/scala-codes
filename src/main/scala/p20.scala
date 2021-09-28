/*
Remove the Kth element from a list.
Return the list and the removed element in a Tuple. Elements are numbered from 0.
Example:

scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
 */

object p20 extends App {

  def removeAt(n: Int, l: List[Symbol]): (List[Symbol], Symbol) = {
    val removed = l(n)
    (l.filter(_ != removed), removed)
  }

  println(removeAt(1, List('a, 'b, 'c, 'd)))

}
