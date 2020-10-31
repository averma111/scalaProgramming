object scalaFunctions {

  // This is simple scala functions type 1
  def add(x: Int, y: Int): Int = {

    return x + y
  }

  // This is simple scala functions type 2
  def sub(x: Int, y: Int): Int = {

    x - y //Last line of fuction as returned value
  }

  // This is simple scala functions type 3
  def multi(x: Int, y: Int): Int = x * y

  def div(x: Int, y: Int) =
    x / y //When we are centain that only integer will be returned

  def main(args: Array[String]): Unit = {

    // println ("Hello Functions")

    println(add(45, 15))
    println(sub(45, 15))
    println(multi(45, 15))
    println(div(45, 15))

    //Calling multiply as function of Math object

    println(Math.multi(4, 5))

    //Calling square fuction as syntactical sugar from scala if there only single argument

    println(Math square 4)
  }

  object Math {

    def multi(x: Int, y: Int): Int = x * y

    def square(x: Int) = x * x

  }
}
