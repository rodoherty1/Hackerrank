package io.rob

import org.scalatest.{Matchers, WordSpec}

import scala.collection.immutable.IntMap

/**
 * Created by rob on 22/03/15.
 */
class NitroTest extends WordSpec with Matchers {

  "My Next Kata app" should {
    "map shit out" in {
      Nitro.doIt() should equal(IntMap(1 -> List("un", "one"), 2 -> List("deux", "two"), 3-> List("trois", "three")))
    }
  }

}
