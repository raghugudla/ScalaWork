package org.scala.lang.classes

object LocationDemo {

  def main(args: Array[String]): Unit = {
    val p = new Point(1, 2)
    p.move(3, 4)

    val l = new Location(1, 2, 3)
    l.move(4, 5, 6)
    l.move(7, 8)
  }

}
