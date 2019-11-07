import java.lang.Exception
import java.lang.IllegalStateException

class namenullIsNullException() : IllegalStateException("namenull is null")

fun nullSecurityCheck(namenull: Int?) {
    namenull ?: throw namenullIsNullException()
}

fun nullCapicityCheck(namenull: Int) {
    require(namenull >= 3, { "namenull is smaller than 3!" })
}

fun main(args: Array<String>) {

    val name = "aldridgevg"
//    val namenull:String? = null
//    throw a exception
//    namenull?:throw IllegalStateException("namenull is null")
//    throw customized exception
//    namenull?:namenullIsNull()


    //throw exception in 1/3 chance use try-catch
    //catch:print exception info and continue running
    var namenull: Int? = null
    val check = (1..3).shuffled().last() == 3
    if (check)
        namenull = 2
    try {
        nullSecurityCheck(namenull)
        namenull = namenull!!.plus(1)
    } catch (e: Exception) {
        println(e)
    }
    println("namenull = " + namenull)

    val namenull1 = (1..3).shuffled().first()
    try {
        nullCapicityCheck(namenull1)
    } catch (e: Exception) {
        println(e)
    }

    println("input name1:")
    var name1 = readLine()    //use safe call operator "?"(readLine return a String?)
    println("input name2:")
    var name2 = readLine()?.let {
        //use safe call operator "let"
        if (it.isNotBlank()) it.capitalize()
        else "null"
    }
    println("input name3:")
    var name3 = readLine()!!.capitalize()   //strong request to call, if null catch KotlinNullPointerException
    val name4: String = name1 ?: name  //use null combine operator - if left of "?:" is null, use right
    println("name1: $name1\nname2: $name2\nname3: $name3\nname4(clone of name1 or name): $name4")

    
}
