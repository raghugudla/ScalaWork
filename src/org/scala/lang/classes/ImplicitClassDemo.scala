package org.scala.lang.classes

import org.scala.lang.classes.ImplicitClassObject._

object ImplicitClassDemo {

  def main(args: Array[String]) {
    4 times print("hello ")

    println()

    val r = new ImplicitClassObject.IntTimes(4)
    r.times(print("scala "))
  }
}
