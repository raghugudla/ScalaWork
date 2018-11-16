package org.scala.lang.classes

class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    println("before move " + this)
    x += dx
    y += dy
    println("after move " + this)
  }

  override def toString: String =
    "Point (" + x + "," + y + ")"

}
