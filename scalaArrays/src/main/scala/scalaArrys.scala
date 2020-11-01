object scalaArrays {

  val array1
      : Array[Int] = new Array[Int](3) //One way to define arrays in scalaArrays

  val array2 = new Array[String](3) // Otherway to defining arrays in scalaArrays

  val array3 = Array(1, 2, 3, 4, 5, 6, 7, 8, 9) // direct integer initialization

  val array4 = Array("USA", "IN", "PAK", "CHN") // direct integer intialization

  def main(args: Array[String]): Unit = {

    //Assigning values to array1
    array1(0) = 30
    array1(1) = 40
    array1(2) = 50

    //Printing values of array1 using for loop
    for (x <- array1) {
      println("Non conventional method " + x)
    }

    //Assiging values to array2
    array2(0) = "Alpha"
    array2(1) = "Beta"
    array2(2) = "Gamma"

    //Printing values of array2 in conventional method

    for (i <- 0 until array2.length) {
      println("Conventional methode " + array2(i))
    }
  }
}
