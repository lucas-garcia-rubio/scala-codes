/*
Modified run-length encoding.
Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied
into the result list.
Only elements with duplicates are transferred as (N, E) terms.
Example:

scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
 */

object p11 {

  def encodeModified(l: List[Any]): List[Any] = {
    if (l.isEmpty)
      List(List())
    else {
      val (packed, tail) = l.span(_ == l.head)
      if (tail == Nil) {
        if (packed.length == 1) packed
        else List(List(packed.length, packed.head))
      }
      else {
        if (packed.length == 1) packed.head :: encodeModified(tail)
        else List(packed.length, packed.head) :: encodeModified(tail)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    println(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e)))
  }
}
