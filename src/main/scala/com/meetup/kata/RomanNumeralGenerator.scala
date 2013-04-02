package com.meetup.kata

import annotation.tailrec

object RomanNumeralGenerator {
  val symbols = List(50-> "L", 40-> "XL", 10 -> "X", 9 -> "IX", 5 -> "V", 4 -> "IV", 1 -> "I")


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
