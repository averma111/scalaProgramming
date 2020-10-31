object scalaMatch {

  def main(args: Array[String]): Unit = {

    //Match example for scala varation type 1 number

    var num = 50

    num match {

      case 20 => println(num)
      case 30 => println(num)
      case 40 => println(num)
      case _  => println("Default")
    }

    //Match example for scala variation type 2 strings

    var str = "city"

    str match {
      case "city" => println(s"The city is $str")
      case _      => println("Default String")

    }

    //Match example with direct varaible type 3

    val city = "Delhi"
    val result = city match {

      case "Delhi" => city
      case _       => "Default"
    }

    println(s"The result is $result")
  }

  for (i <- 1 to 10) {

    var even = i % 2

    var outcome = even match {

      case 0 => "Even"
      case 1 => "Odd"
      case _ => "Default"
    }
    println(outcome)
  }

}
