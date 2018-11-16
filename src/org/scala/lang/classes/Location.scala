package org.scala.lang.classes

class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    println("before move " + this)
    x += dx
    y += dy
    z += dz
    println("after move " + this)
  }

  override def toString: String =
    "Location (" + x + "," + y + "," + z + ")"
}
