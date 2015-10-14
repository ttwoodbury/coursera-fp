package lecture1

object rationals {
  val x = new Rational(1,3)                       //> x  : lecture1.Rational = 1/3
  val y = new Rational(5,7)                       //> y  : lecture1.Rational = 5/7
  val z = new Rational(3,2)                       //> z  : lecture1.Rational = 3/2
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  x + y                                           //> res2: lecture1.Rational = 22/21
  x - y - z                                       //> res3: lecture1.Rational = -79/42
  y + y                                           //> res4: lecture1.Rational = 10/7
  x max z                                         //> res5: lecture1.Rational = 3/2

 
}

class Rational(x: Int, y: Int) {
	
	require(y != 0, "Denominator must be non-zero")
  
  private def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a % b)
  
  private val g = gcd(x,y)
  
  def numer = x/g
  def denom = y/g
  
  def + (r: Rational) =
    new Rational(
      numer*r.denom + r.numer*denom,
      r.denom*denom)
  
  def unary_- : Rational = new Rational(-numer,denom)
  
  def < (r: Rational) = numer*r.denom < r.numer*denom
  
  def - (r: Rational) = this + -r
  
  def max(that: Rational) = if (this < that) that else this
  
  override def toString = numer + "/" + denom

}