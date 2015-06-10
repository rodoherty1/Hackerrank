package io.rob

import io.rob.StringCompression.loop
import org.scalatest.{Matchers, WordSpec}

/**
 * Created on 10/06/15.
 */
class StringCompressionTest extends WordSpec with Matchers {

  "My StringCompression" should {
    "Compress aaa into a3" in {
      loop("aaa") should be ("a3")
      loop("abcd") should be ("abcd")
      loop("a1bbccc") should be ("a1b2c3")
      loop("") should be ("")
      loop("a") should be ("a")
    }
  }

}
