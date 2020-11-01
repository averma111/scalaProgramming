object scalaLists {

  val intList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val strList = List("Alpha", "Beta", "Gamma", "Theta")

  def main(args: Array[String]): Unit = {

    //Lists are immutable , same datatype data structures in scala

    //Priting the list content using foreach keyword.
    //intList.foreach(println)
    //strList.foreach(println)

    //Priting each individual List
    println(intList)
    println(strList)

    /*Cons and Nil concept in scala
    :: represented as Cons
    Nil as Nil.
     */

    //To add any element in the beginning in list using cons(::)
    println(12 :: intList)

    println(Nil) //Generate empty List

    println("ScalaLanguage" :: Nil) //List with one element
  }
}
