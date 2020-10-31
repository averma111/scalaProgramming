object scalaFunctionsNext {

  object Math {

    //Fucntions with default argument

    def add(x: Int = 45, y: Int = 35): Int = {

      return x + y
    }

  }

  def main(args: Array[String]): Unit = {

    //Declaring anonymous Fucntions

    var result = (a: Int, b: Int) => a + b
    // Calling anonymou functions

    println("I am anonymous function " + result(6, 10))

    //Calling add when default parameters are provided
    println("The resule from default parameter " + Math.add())

    //Calling add when first value is provided as parameter

    println("The resule from first parameter " + Math.add(35))

  }
}
