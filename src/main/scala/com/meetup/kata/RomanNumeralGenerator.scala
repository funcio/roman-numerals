package com.meetup.kata

import annotation.tailrec

object RomanNumeralGenerator {
  val symbols = List(50-> "L", 40-> "XL", 10 -> "X", 9 -> "IX", 5 -> "V", 4 -> "IV", 1 -> "I")


  def generate(i: Int): String = {
    @tailrec
    def genRec(i: Int, acc: String): String = {
      if (i == 0) acc
      else {
        val maxSymbol = symbols.filter(s => s._1 <= i).head
        genRec(i - maxSymbol._1, acc + maxSymbol._2)
      }
    }

    genRec(i, "")
  }

}
