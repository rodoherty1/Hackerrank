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
}

