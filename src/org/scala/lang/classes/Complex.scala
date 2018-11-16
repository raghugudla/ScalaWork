package org.scala.lang.classes

class Complex(real: Int, imaginary: Double) {
  def re() = real
  def im() = imaginary

  override def toString: String =
    "" + re + (if (im < 0) "-" else "+") + im + "i"
}