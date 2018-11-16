package org.scala.lang.basics

import java.text.DateFormat._
import java.util.{Date, Locale}

object ScalaJavaInti {

  def main(args: Array[String]): Unit = {

    val now = new Date()
    println("now: " + now)

    val sv_se = new Locale("sv", "SE")
    println("locale: " + sv_se)

    val df = getDateInstance(LONG, sv_se)
    println("df: " + df)

    println(df format now)

  }
}