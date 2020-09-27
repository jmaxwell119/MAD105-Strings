// if i don't need to keep track of user input, i can use 1 variable
// by running the if statement directly after asking the question

fun main(){
    println("This is a sports quiz. You will be shown a number of positions that players might play, and you must type in the name of the sport that has those positions.")
    // store correct answers as constants
    val answer1 = "basketball"
    val answer2 = "football"
    val answer3 = "baseball"
    val answer4 = "hockey"
    val answer5 = "soccer"
    // counter to store number of correct responses
    var correctCounter = 0

    // prompt user for an answer, use readLine to assign input to a constant
    print("What sport has: point guard, power forward, center? ")
    var guess = readLine()!!.toString()
    // use compareTo, with ignoreCase as true to compare guess with correct answer
    val result1 = answer1.compareTo(guess, true)
    // if two strings are the same, compareTo will result in 0. use if-else statement to print whether answer was correct
    if (result1 == 0){
        println("Question 1: Correct")
        // if response is correct, increment counter variable
        correctCounter ++
    }
    else
        println("Question 1: Incorrect")

    print("What sport has: tight end, wide receiver, running back? ")
    guess = readLine()!!.toString()
    val result2 = answer2.compareTo(guess, true)
    if (result2 == 0){
        println("Question 2: Correct")
        correctCounter ++
    }
    else
        println("Question 2: Incorrect")

    print("What sport has: second baseman, catcher, right fielder? ")
    guess = readLine()!!.toString()
    val result3 = answer3.compareTo(guess, true)
    if (result3 == 0){
        println("Question 3: Correct")
        correctCounter ++
    }
    else
        println("Question 3: Incorrect")

    print("What sport has: left wing, goaltender, defenceman? ")
    guess = readLine()!!.toString()
    val result4 = answer4.compareTo(guess, true)
    if (result4 == 0){
        println("Question 4: Correct")
        correctCounter ++
    }
    else
        println("Question 4: Incorrect")

    print("What sport has: sweeper, midfielder, striker? ")
    guess = readLine()!!.toString()
    val result5 = answer5.compareTo(guess, true)
    if (result5 == 0){
        println("Question 5: Correct")
        correctCounter ++
    }
    else
        println("Question 5: Incorrect")

    println("you got $correctCounter questions correct")
}