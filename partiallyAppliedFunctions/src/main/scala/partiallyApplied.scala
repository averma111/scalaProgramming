import java.util.Date

object partiallyApplied {

  //Partially Applied functions are those functions which one or more arugments as wild card during run time.

  def main(args: Array[String]): Unit = {

    val mysum = (x: Int, y: Int, z: Int) => x + y + z

    val f = mysum(10, _: Int, _: Int)

    print(f(30, 20))

    //Creating new date object

    var dt = new Date()

    //Calling the log method
    var logres = log(dt, _: String)
    logres("This is sample log 1 ")
    logres("This is sample log 2 ")
    logres("This is sample log 3 ")
    logres("This is sample log 4 ")

  }

  //Partially Applied function in logging example

  def log(mydate: Date, messsage: String): Unit = {
    println(mydate + "   " + messsage)
  }
}
