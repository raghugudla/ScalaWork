package scala.org.scala.lang

import java.util.Date
import java.text.DateFormat._
import java.util.Locale

object ComplexObjects {
  
  def main(args : Array[String]): Unit = {
    val c = new Complex(1, 2.5)
    println(c.re())    
    println(c.im)    
    println(c)    
  }
}