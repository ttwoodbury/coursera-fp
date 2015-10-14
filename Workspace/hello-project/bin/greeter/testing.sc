package greeter

object testing {
  val x = 1                                       //> x  : Int = 1
  def increase(i: Int) = i + 1                    //> increase: (i: Int)Int
  val y = increase(x)                             //> y  : Int = 2
  increase(y)                                     //> res0: Int = 3
}