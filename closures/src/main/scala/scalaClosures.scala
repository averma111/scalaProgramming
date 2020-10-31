import java.util.Date
object scalaClosures {

  /*A closure is fuction in which one ore more argument/variables are defined
  outside the function */

  val number = 10 // variable declare outside the function.This free variable
  val add = (x :Int) => x + number //nubmer as variable with add function

  def main(args : Array[String]): Unit = {

    //number = 50 // closure takes last valid state of the free vraible.
    println(add(20))

  }

  /*Pure Closure Its closure where the free varaiable is defined as val,
  Impure Closure Its closure where the free varaible is defined as var.*/
}
