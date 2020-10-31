object higherOrderFunctions {

  //Higher order fuctions are those functions which take fucntions are arguement and retrun out as function result

  def myMath(
      num1: Double,
      num2: Double,
      num3: Double,
      func: (Double, Double) => Double
  ): Double = func(func(num1, num2), num3)

  def main(args: Array[String]): Unit = {

    var outcome = myMath(30, 20, 10, (x, y) => x * y) // with varaible

    var outcomeWild = myMath(30, 20, 10, _ * _) // with wild card varaible
    println(outcome, outcomeWild)
  }
}
