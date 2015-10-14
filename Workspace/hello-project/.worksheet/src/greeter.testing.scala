package greeter

object testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(45); 
  val x = 1;System.out.println("""x  : Int = """ + $show(x ));$skip(31); 
  def increase(i: Int) = i + 1;System.out.println("""increase: (i: Int)Int""");$skip(22); 
  val y = increase(x);System.out.println("""y  : Int = """ + $show(y ));$skip(14); val res$0 = 
  increase(y);System.out.println("""res0: Int = """ + $show(res$0))}
}
