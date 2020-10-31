
object scalaLoops {

  def main(args: Array[String]): Unit = {

    var x = 0

    //While loop example in scala

    while (x < 10) {

      println(f"x is $x%d")

      x = x + 1
    }

    //Do while loop in scala

    var y = 0

    do {
      println(s"y is " + y)

      y = y + 1
    } while (y < 21)
  }

  // For loops in scala varation type 1

  for (i <- 1 to 10) {
    println(f"i to $i%d")
  }

  // For loops in scala varaition type 2
  for (i <- 1 until 10) {

    println(f"i until $i%d")
  }

  // For loop using nested loop variation 3
  for (x <- 1 to 10; y <- 1 to 10) {
    println(s"x using multiple range $x $y")
  }

  //For loop using List variation 4
  val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  for (a <- lst) {

    println(s"This is list $a")

  }

  //For loop with if condition to filter values variation 5
  for (a <- lst; if a % 2 == 0) {

    println(s"This is even list $a")

  }

  //For loops as expression variation 6
  val result = for { a <- lst; if a < 6 } yield {
    a + a
  }
  println(s"This is result $result")

}