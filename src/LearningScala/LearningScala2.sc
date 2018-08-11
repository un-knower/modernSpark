object LearningScala2 {
  // Flow control

  // If / else syntax
  if (1 > 3) println("Impossible!") else println("The world makes sense.")   //> The world makes sense.

  if (1 > 3) {
  	println("Impossible!")
  } else {
  	println("The world makes sense.")
    println("this is impossible, too!")
  }                                               //> The world makes sense.

  // Matching - like switch in other languages:
  val number = 5                                  //> number  : Int = 3
  number match {
  	case 1 => println("One")
  	case 2 => println("Two")
  	case 3 => println("Three")
  	case _ => println("Something else")
 	}                                         //> Three

  number match {
    case 1 => println("case 1")
    case 2 => println("case 2")
    case 3 => println("case 3")
    case _ => println("base case")
  }

  // my for loops
  for(x<- 1 to 3; y<- 1 to 5){
    println("value of x: "+ x)
    println("value of y : "+ y)
    println("----------------")
  }

  // loop through list and with for loop filter
  val numList = List(1,2,3,4,5,6,7,8)
  for( a<- numList; if a<7 ; if a != 5){
    println(a)
  }

  var retVal = for(al<- numList; if al>3; if al !=5) yield al
  println(retVal)
  for(a<- retVal) println(a)


 	// For loops
 	for (x <- 1 to 4) {
 		val squared = x * x
 		println(squared)
 	}                                         //> 1
                                                  //| 4
                                                  //| 9
                                                  //| 16

  // While loops
  var x = 10                                      //> x  : Int = 10
  while (x >= 0) {
  	println(x)
  	x -= 1
  }                                               //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0

  x = 0
  do { println(x); x+=1 } while (x <= 10)         //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10

   // Expressions
   // "Returns" the final value in a block automatically

  {val x = 10; x + 20}                           //> res0: Int = 30
  {val y = 200; y}
  println({var z: Int = 300 ; z /= 2 ; z})

  println({val x = 10; x + 20})            //> 30

	 // EXERCISE
	 // Write some code that prints out the first 10 values of the Fibonacci sequence.
	 // This is the sequence where every number is the sum of the two numbers before it.
	 // So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34


}