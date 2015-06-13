package io.rob

import org.scalatest.{Matchers, WordSpec}

/**
 * Created on 09/04/15.
 */
class BAMLTest extends WordSpec with Matchers {

  "My BAML App" should {
    "demonstrate higher-order functions in action using BAML.modifyList" in {
      val f: (List[String]) => List[String] = BAML.modify((s: String) => s"_$s")
      BAML.modifyList(f, List ("a", "b", "c", "d")) should equal (List("_a", "_b", "_c", "_d"))
    }

    "demonstrate my home-grown zipWith" in {
      val f: (Int, Int) => Int = (a: Int, b: Int) => a + b
      BAML.zipWith(List (1, 2,3,4), List (4, 5,6,7), f) should equal(List(5, 7, 9, 11))
    }

    "demonstrate my home-grown hasSubsequence" in {
      BAML.hasSubsequence(List(1, 2,3, 4), List(2, 3)) should be (right = true)
      BAML.hasSubsequence(List(1, 2,3, 4), List(2, 4)) should be (right = false)
      BAML.hasSubsequence(List(1, 2,3, 4), List(1, 2, 3, 4)) should be (true)
      BAML.hasSubsequence(List(1, 2,3, 4), List.empty[Int]) should be (true)
      BAML.hasSubsequence(List(1), List(1, 2)) should be (false)
    }
  }

}
