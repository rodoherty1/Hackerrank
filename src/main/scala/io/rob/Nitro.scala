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


  def doIt2(): IntMap[List[String]] = {
    val m1 = IntMap(1 -> "un", 2 -> "deux", 3 -> "trois").values.toList
    val m2 = IntMap(1 -> "one", 2 -> "two", 3 -> "three").values.toList

    val z = m1 zip m2

    val i: List[List[String]] = for {
      (a, b) <- z
    } yield List(a, b)

    def loop(acc: IntMap[List[String]], index: Int, l: List[List[String]]): IntMap[List[String]] = {
      l match {
        case Nil => acc
        case _ => loop(acc.updated(index, l.head), index+1, l.tail)
      }
    }

    loop(IntMap.empty[List[String]], 1, i)
  }
}
