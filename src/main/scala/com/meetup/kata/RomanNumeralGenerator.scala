package com.meetup.kata

import annotation.tailrec

object RomanNumeralGenerator {
  val coolSymbols = List(1000 ->"M" , 100->"C" , 10 -> "X", 1 -> "I")
  val uncoolSymbols = List(500 -> "D" , 50-> "L" ,  5 -> "V")
  val symbols = {(coolSymbols ::: uncoolSymbols) flatMap {
      s =>
        Seq(s) ++ coolSymbols.filter(cs => cs._1 < s._1)
          .headOption.map(c => (s._1 - c._1) -> (c._2 + s._2)).toSeq
    }}.sortBy(- _._1)

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
