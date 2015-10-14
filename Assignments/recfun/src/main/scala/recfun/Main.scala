package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  println()
  val test = "(if (ze(((ro? x) max (/ 1 x)))"
  println(balance(test.toList))
  println(countChange(100,List(1,5,10,25)))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0) 1
    else if (c == r) 1
    else pascal(c,r-1)+pascal(c-1,r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    
    def loop(opened: Int, rest: List[Char]): Boolean = {
      if (rest.isEmpty) opened == 0
      else if (opened < 0) false
      else if (rest.head == '(') loop(opened + 1, rest.tail)
      else if (rest.head == ')') loop(opened - 1, rest.tail)
      else loop(opened, rest.tail)
    }
    
  loop(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
     
    if (money == 0) 1
    else if (money < 0) 0
    else if (coins.isEmpty) 0
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
    
    
}
