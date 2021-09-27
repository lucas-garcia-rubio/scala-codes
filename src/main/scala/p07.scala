/*
Flatten a nested list structure.
Example:
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
 */

// https://stackoverflow.com/questions/37340912/scala-flatmap-what-are-ms-and-e/37349449

// Now I'm going to use every tool I want to
object p07 {

  def flatten(l: List[Any]): List[Any] = l flatMap {
    case x: List[_] => flatten(x)
    case y => List(y)
  }

  def main(args: Array[String]): Unit = {
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }
}
