package io.rob

import scala.io.{BufferedSource, Source}


object StringCompression {

  def loop(input: String, output:String = ""): String = {
    if (input.isEmpty) output
    else {
      val chars: String = input.takeWhile(_.equals(input(0)))

      if (chars.length == 1) {
        loop(input.substring(chars.length), output + chars(0))
      } else {
        loop(input.substring(chars.length), output + chars(0) + chars.length)
      }
    }
  }

  def main (args: Array[String]): Unit = {
    val lines = Source.stdin.getLines().toList.head
    loop(lines)
  }
}
