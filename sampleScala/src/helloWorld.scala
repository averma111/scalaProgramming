
object helloWorld {
  
    def main(args : Array[String]) : Unit ={
      
      //println("Hello World")
      
      val name = "James"
      
      val age = 35.5
      
      //String interpolation type 1
      
      println("The name is " + name + " Bond")
      
      //String interpolation type 2
      
      println(s"The name is $name Bond")
      
      //String interpolation type 3 type safe
      
      println(f"The name is $name%s Bond and age is $age%f")
      
      //String interpolation type 4 type raw
      
      println(raw"The name is $name Bond and age is $age")
    }
    
}