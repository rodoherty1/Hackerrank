package io.rob

/**
 * Created on 09/04/15.
 */
object ForComprehension {

  def test1(): List[(Int, Int)] = {
    var l = List(1, 2, 3, 4, 5)
    var m = List(6, 7, 8, 9, 10)

    l zip m
  }
}

