package com.meetup.kata

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class RomanNumeralTest extends FlatSpec with ShouldMatchers {

  "A Roman Numeral Generator" should "return I when 1 is to be parsed" in {
    RomanNumeralGenerator.generate(1) should be ("I")
  }

  it should "return II when 2 is to be parsed" in {
    RomanNumeralGenerator.generate(2) should be ("II")
  }

  it should "return V when 5 is to be parsed" in {
    RomanNumeralGenerator.generate(5) should be ("V")
  }

  it should "return IV when 4 is to be parsed" in {
    RomanNumeralGenerator.generate(4) should be ("IV")
  }

  it should "return VI when 6 is to be parsed" in {
    RomanNumeralGenerator.generate(6) should be ("VI")
  }

  it should "return IX when 9 is to be parsed" in {
    RomanNumeralGenerator.generate(9) should be ("IX")
  }

  it should "return X when 10 is to be parsed" in {
    RomanNumeralGenerator.generate(10) should be ("X")
  }

  it should "return XV when 15 is to be parsed" in {
    RomanNumeralGenerator.generate(15) should be ("XV")
  }

  it should "return XIX when 19 is to be parsed" in {
    RomanNumeralGenerator.generate(19) should be ("XIX")
  }


  it should "return XLIX when 49 is to be parsed" in {
    RomanNumeralGenerator.generate(49) should be ("XLIX")
  }


}
