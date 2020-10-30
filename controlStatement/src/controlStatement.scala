

object controlStatement {

  def main(args: Array[String]): Unit = {

    val x = 50
    val y = 30
    var res = ""

    //Control statement variation type 1
    if (x == 50 && y ==30 && x < y) {
      res = "true"
      println(res)
    } else {
      res = "false"
      println(res)
    }

    //Control statement variation type 2
    val res1 = if (x == 50) "x=50" else "x!=50"

    println(res1)

    //Control statment direclty priting line type 3

    println(if (x == 50) "x=50" else "x!=50")
  }
}