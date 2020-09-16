fun main(){
    println("This is a sports quiz. You will be shown a number of positions that players might play, and you must type in the name of the sport that has those positions.")
    val answer1 = "basketball"
    val answer2 = "football"
    val answer3 = "baseball"
    val answer4 = "hockey"
    val answer5 = "soccer"
    print("What sport has: point guard, power forward, center? ")
    val guess1 = readLine()!!.toString()
    print("What sport has: tight end, wide receiver, running back? ")
    val guess2 = readLine()!!.toString()
    print("What sport has: second baseman, catcher, right fielder? ")
    val guess3 = readLine()!!.toString()
    print("What sport has: left wing, goaltender, defenceman? ")
    val guess4 = readLine()!!.toString()
    print("What sport has: sweeper, midfielder, striker? ")
    val guess5 = readLine()!!.toString()
    var correctCounter = 0

    val result1 = answer1.compareTo(guess1, true)
    if (result1 == 0){
        println("Question 1: Correct")
        correctCounter += 1
    }
    else
        println("Question 1: Incorrect")
    val result2 = answer2.compareTo(guess2, true)
    if (result2 == 0){
        println("Question 2: Correct")
        correctCounter += 1
    }
    else
        println("Question 2: Incorrect")

    val result3 = answer3.compareTo(guess3, true)
    if (result3 == 0){
        println("Question 3: Correct")
        correctCounter += 1
    }
    else
        println("Question 3: Incorrect")

    val result4 = answer4.compareTo(guess4, true)
    if (result4 == 0){
        println("Question 4: Correct")
        correctCounter += 1
    }
    else
        println("Question 4: Incorrect")

    val result5 = answer5.compareTo(guess5, true)
    if (result5 == 0){
        println("Question 5: Correct")
        correctCounter += 1
    }
    else
        println("Question 5: Incorrect")

    println("you got $correctCounter questions correct")
}