fun main(args: Array<String>) {

    //var - variable; val - readonly
    val all = 1
    val born = "aldridgeVG"
    println("hello, $born. Welcome to Kotlin!");

    //in range: a..b; a downTo b; a until b(not included);
    //extract as function
    var distanceHome = 502
    val commuteWay = commuteWay(distanceHome)
    println("today you go to school by $commuteWay")

    //branch phase by "when" (like switch case)
    //extract when judge section as function
    var timeLeft = 25
    val breakfast = judgeBreakfast(timeLeft)
    println("you ate $breakfast for breakfest")

    //customized function knockInto
    var crowdIndex = 5
    val peopleKnockedInto = knockInto(crowdIndex)
    println("you knocked into $peopleKnockedInto people on your way")

    //a unit fun(no return type)
    ahHah()

    //use named fun parameter
    println("you entred the school")
    routeIn("W5", "W3", "W12")
    routeIn(
        vertex2 = "W3",
        vertex1 = "W5",
        vertex3 = "W12"
    )

    println()
    //anonymous fun
    //no return -> automatically return the last line
    println("you went to Algorithm Design class, Mrs.He is performing a lecture on string match")
    //use it when only 1 para
    val numOfS = "Mississippi".count { it == 's' }
    println("you can find $numOfS letter s in the word Mississippi")
    println({ val type = "anonymous";"You called a fun! fun type: $type" }())   //print a anonymous fun

    //fun type (DIFFER FROM Function Type)
    //() -> String means this fun variable stores a String data type
    //() includes multiple parameters, in the beginning use "para1, para2... ->" to declare
    val callingFunction: (String, Int) -> String = { s1, i1 ->
        val type = "anonymous"
        "$s1, you called a fun! fun No.$i1 fun type: $type"
    }
    val callingFunction1 = generateCallingFun()
    println(callingFunction(born, all))
    println(callingFunction1(born))




}

private fun commuteWay(distanceHome: Int): String {
    return if (distanceHome in 1000 downTo 500) "Metro"
    else if (distanceHome in 250..499) "Bus"
    else if (distanceHome in 100..249) "Bike"
    else if (distanceHome in 0 until 100) "Foot"
    else "?"
}

private fun judgeBreakfast(timeLeft: Int): String {
    return when (timeLeft) {
        0 -> "nothing"
        in 1 until 10 -> "almost nothing"
        in 10 until 20 -> "bread"
        in 20..50 -> "MCDs"
        else -> "?"
    }
}

//set default parameter crowdIndex as 3 when no para recvd
//this is a single-expression fun
private fun knockInto(crowdIndex: Int = 3): Int = crowdIndex * crowdIndex * 2

//a unit fun, and single-expression fun
private fun ahHah() = println("ah-Hah!")

//use to test named fun para
private fun routeIn(vertex1: String, vertex2: String, vertex3: String) =
    println("your route is $vertex1 to $vertex2 to$vertex3")

//return type as fun type
fun generateCallingFun():(String)->String{
    val type = "generated anonymous"
    return {s1:String->
        "$s1, you called a fun! fun type: $type"
    }
}