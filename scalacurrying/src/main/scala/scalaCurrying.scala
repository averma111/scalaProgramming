import java.util.Date

/*Currying is the process of converting a function that converts a function with
multiple arguement into a function with single argument*/

object scalaCurrying {

  def add(x: Int, y: Int) = x + y

  def myAdd(x: Int)(y: Int) = x + y //Curried function definition.Two arugments
  //are borken into one

  def main(args: Array[String]): Unit = {

    println("Regular function " + add(40, 50))

    //Calling curried function

    println("Curried function " + myAdd(50)(60))

    //Calling curried function as partially applied function.

    val result = myAdd(30)(_: Int)

    println("Curried partially applied function " + result(40))
  }
}
