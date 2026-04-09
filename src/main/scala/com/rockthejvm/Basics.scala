package com.rockthejvm

object Basics extends App {

  // defining a value
  val meaningOfLife: Int = 42 // val means immutable variable

  val a_boolean = false

  val a_string = "I Love Scala!"
  val a_composed_string = "I"+" "+"am"+" "+"a"+" "+"love"+"r"+" "+"of"+" "+"Scala"
  val an_interpolated_string =  s"The meaning of life is $meaningOfLife"

  val an_expression = 2 + 3

  val if_expression = if (meaningOfLife > 43) 56 else 999
  val chained_if_expression =
    if (meaningOfLife > 43) 56
    else if (meaningOfLife < 0) -2
    else if (meaningOfLife > 999) 78
    else 0


  // code blocks
  val a_codeblock = {
    // definitions
    val a_localvalue = 67

    // value of block is the value of last expression
    a_localvalue + 3
  }
  // define a function
  def myFunction(x: Int, y: String): String = {
    y+" "+x
  }

  // recursive functions
  def factorial(n: Int): Int =
    if (n<=1) 1
    else n*factorial(n-1)

  // the unit type = a return type of no meaningful value --> it's the equivalent of "void" in other languages
  println("I love Scala")

  def myUnitReturningFunction(): Unit = {
    println("I don't love returning Unit")
  }

  val theUnit = ()

}
