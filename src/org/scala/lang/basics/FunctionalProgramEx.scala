package org.scala.lang.basics

object FunctionalProgramEx {
  
  def timeFlies() {
    println("time flies like an arrow...")
  }
  
  def oncePerSecond(callback: () => Unit) {
      callback()
  }
  
  def main(args : Array[String]) {
    
    oncePerSecond { () => println("Hello Functional Programming type-1")}
    
    oncePerSecond(() => println("Hello Functional Programming type-2"))

    oncePerSecond(timeFlies)
  }
  
}