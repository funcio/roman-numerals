package com.meetup.kata

import annotation.tailrec

object RomanNumeralGenerator {
  val coolSymbols = List(1000 ->"M" , 100->"C" , 10 -> "X", 1 -> "I")
  val uncoolSymbols = List(500 -> "D" , 50-> "L" ,  5 -> "V")
  val symbols = // List(50-> "L", 40-> "XL", 10 -> "X", 9 -> "IX", 5 -> "V", 4 -> "IV", 1 -> "I")
  {
    val oddSymbols = {coolSymbols ::: uncoolSymbols} flatMap {
      s =>
        val cool = coolSymbols.filter(cs => cs._1 < s._1).headOption
        cool.map(c => (s._1 - c._1) -> (c._2 + s._2))
    }
    (coolSymbols ::: uncoolSymbols ::: oddSymbols).sortBy(_._1).reverse
  }
  //val deducedSymbols = List(900 -> "CM" , 400 -> "CD" , 90 -> "XC" , 40 -> "XL" , 9 -> "IX", 4 -> "IV")



  def generate(i: Int): String = {

    symbols.foldLeft((i, "") ){(acc,t)=>
      if (acc._1 < t._1) acc
      else {
        val repetitions = acc._1 / t._1
        (acc._1-(t._1*repetitions), acc._2 + (t._2 * repetitions))
      }
    }._2


  }
}
