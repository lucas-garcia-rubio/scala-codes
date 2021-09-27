/*
Find out whether a list is a palindrome.
Example:
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
 */

object p06 {

  def isPalindrome(l: List[Int]): Boolean = {
    l == l.reverse
  }

  def main(args: Array[String]): Unit = {
    println(isPalindrome(List(1, 2, 3, 2, 1)))
  }
}
