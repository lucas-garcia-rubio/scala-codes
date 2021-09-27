/*
Run-length encoding of a list.
Use the result of problem P09 to implement the so-called run-length encoding data compression method.
Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
Example:

scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
 */

object p10 {

  def encode(l: List[Any]): List[List[Any]] = {
    if (l.isEmpty)
      List(List())
    else {
      val (packed, tail) = l.span(_ == l.head)
      if (tail == Nil) {
        List(List(packed.length, packed.head))
      }
      else {
        List(packed.length, packed.head) :: encode(tail)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

}
