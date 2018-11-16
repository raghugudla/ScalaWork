package org.scala.lang.basics

object VarAssignEx {

  def main(args: Array[String]): Unit = {

    var myVar: Int = 10
    val myVal: String = "Hello Scala with data type declaration."
    println(myVar);
    println(myVal)

    myVar = 20
    val myVal1 = "Hello Scala data type inference."
    println(myVar);
    println(myVal1)
  }
}
