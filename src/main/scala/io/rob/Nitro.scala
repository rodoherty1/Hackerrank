package io.rob

import scala.collection.immutable.IntMap

/**
 * Created by rob on 22/03/15.
 */
object Nitro {

  def doIt(): IntMap[List[String]] = {
    val m1 = IntMap(1 -> "un", 2 -> "deux", 3 -> "trois")
    val m2 = IntMap(1 -> "one", 2 -> "two", 3 -> "three")

    val l: Iterable[(String, String)] = m1.values zip m2.values
    val m: Iterable[List[String]] = l.map { case (a,b) => List(a, b)}

    var myMap = Map[Int, List[String]]()
    for ((a, s1) <- m1; s2  = m2(a)) {
      myMap = myMap.updated(a, List(s1, s2))
    }

    myMap.foldLeft(IntMap.empty[List[String]])((m, v) => m.updated(v._1.toInt, v._2))
  }
}
