package me.ayberkt

object Types {
  sealed trait T
    case class Var(s : String) extends Tm
    case class Const(n : Int)  extends Tm

  sealed trait Tm
    case class Pure(t : T)
    case class Tuple(ts : Array[T])

  type Problem = (Array[T], Array[T])
  val left = (x : Problem) => x._1
  val right = (x : Problem) => x._2

}

object unifyModAC extends (Unit => Unit) {

  def apply(x : Unit) = println("Hi!")

}
