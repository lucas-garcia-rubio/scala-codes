/*
Rotate a list N places to the left.
Examples:
scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) //length = 11
res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
 */

object p19 extends App{

  def rotate(n: Int, l: List[Symbol]): List[Symbol] = {
    if (n >= 0) {
      val (beginning, ending) = l.splitAt(n)
      ending ::: beginning
    }
    else {
      val m = l.length + n
      val (beginning, ending) = l.splitAt(m)
      ending ::: beginning
    }
  }

  println(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

}
