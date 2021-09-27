/*
Extract a slice from a list.
Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to
but not including the Kth element of the original list. Start counting the elements with 0.
Example:

scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)
 */

// Scala também tem a função Built-in slice que faz exatamente a mesma coisa
object p18 {

  def slice(i: Int, j: Int, l: List[Symbol]): List[Symbol] = {
    l.zipWithIndex.filter(x => (x._2 >= i) && (x._2 < j)).map(y => y._1)
  }

  def main(args: Array[String]): Unit = {
    println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}
