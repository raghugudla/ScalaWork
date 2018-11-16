package org.scala.lang.classes

object ComplexObjects {

  def main(args: Array[String]): Unit = {
    val c = new Complex(1, 2.5)
    println(c.re())
    println(c.im)
    println(c)
  }
}
