package lecture1

object rationals {
  val x = new Rational(1,3)
  val y = new Rational(5,7)
  val z = new Rational(3,2)
  x.numer
  x.denom
  x.add(y)
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y
  
  def add(r: Rational) =
    new Rational(
      numer*r.denom + r.numer*denom,
      r.denom*denom)
  
  override def toString = numer + "/" + denom

}