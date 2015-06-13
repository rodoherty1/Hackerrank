package io.rob

/**
 * Created on 09/04/15.
 */
object BAML {

  def test1(): List[(Int, Int)] = {
    val l = List(1, 2, 3, 4, 5)
    val m = List(6, 7, 8, 9, 10)

    l zip m
  }

  def modifyList[A](f: List[A] => List[A], l: List[A]): List[A] = f(l)

  def reverse[A](l: List[A]): List[A] = {
    def loop(in: List[A], out: List[A]): List[A] = {
      in match {
        case Nil => out
        case h :: t => loop(t, h :: out)
      }
    }

    loop(l, List.empty[A])
  }

  def modify[A](f: A => A)(l: List[A]): List[A] = {
    l map f
  }

  def zipWith[A](l1: List[A], l2: List[A], f: (A, A) => A): List[A] = {
    (l1, l2) match {
      case (Nil, _) => Nil
      case (_, Nil) => Nil
      case ((h1 :: t1), (h2 :: t2)) => f(h1, h2) :: zipWith(t1, t2, f)
    }
  }

  def startsWith[A](sup: List[A], sub: List[A]): Boolean = {
    val f: ((A, A) => Boolean) = (a1, a2) => a1.equals(a2)
    (sup, sub) match {
      case (Nil, _) => false
      case (_, Nil) => true
      case ((h1::t1), (h2::t2)) => if (h1.equals(h2)) startsWith(t1, t2) else false
    }
  }

  def hasSubsequence[A](sup: List[A], sub: List[A]): Boolean = {
    if (sup.length < sub.length) false
    else {
      sup match {
        case Nil => true
        case h :: t => if (sup.startsWith(sub)) true else hasSubsequence(t, sub)
      }
    }
  }
}

