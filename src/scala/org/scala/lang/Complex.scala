package scala.org.scala.lang

class Complex(real: Int, imaginary: Double) {
  def re() = real
  def im() = imaginary
  
  override def toString() =
    "" + re + (if (im < 0) "-" else "+") + im + "i"
}