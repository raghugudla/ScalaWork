package org.scala.lang.classes

object ImplicitClassObject {

  implicit class IntTimes(x: Int) {

    def times(f: => Unit): Unit = {

      def loop(current: Int): Unit =

        if (current > 0) {
          f
          loop(current - 1)
        }

      loop(x)
    }
  }

}
