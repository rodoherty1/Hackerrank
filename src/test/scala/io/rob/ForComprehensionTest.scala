package io.rob

import org.scalatest.{Matchers, WordSpec}

/**
 * Created on 09/04/15.
 */
class ForComprehensionTest extends WordSpec with Matchers {

  "My App" should {
    "run test1" in {
      ForComprehension.test1() should equal (List((1, 6), (2, 7), (3, 8), (4, 9), (5, 10)))
    }
  }

}
