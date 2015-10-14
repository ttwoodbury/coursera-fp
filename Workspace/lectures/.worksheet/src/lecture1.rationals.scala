package lecture1

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  val x = new Rational(1,3);System.out.println("""x  : lecture1.Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(5,7);System.out.println("""y  : lecture1.Rational = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : lecture1.Rational = """ + $show(z ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(8); val res$2 = 
  x + y;System.out.println("""res2: lecture1.Rational = """ + $show(res$2));$skip(12); val res$3 = 
  x - y - z;System.out.println("""res3: lecture1.Rational = """ + $show(res$3));$skip(8); val res$4 = 
  y + y;System.out.println("""res4: lecture1.Rational = """ + $show(res$4));$skip(10); val res$5 = 
  x max z;System.out.println("""res5: lecture1.Rational = """ + $show(res$5))}

 
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
