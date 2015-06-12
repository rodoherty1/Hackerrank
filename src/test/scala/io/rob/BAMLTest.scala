package io.rob

import org.scalatest.{Matchers, WordSpec}

/**
 * Created on 09/04/15.
 */
class BAMLTest extends WordSpec with Matchers {

  "My BAML App" should {
    "run test1" in {

      val f: (List[String]) => List[String] = BAML.modify((s: String) => s"_$s")
      BAML.modifyList(f, List ("a", "b", "c", "d")) should equal (List("_a", "_b", "_c", "_d"))
    }
  }

}
