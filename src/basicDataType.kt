import kotlin.math.roundToInt

const val shopName = "Anthea's Bar"
var myMoney = 500

fun main(args: Array<String>) {

    val cost1 = placeOrder("wine,groovyBreaker,53,2")
//    val cost1 = placeOrder("wine,Dragon's Breath,100,1")
    myMoney -= cost1
    println("You have $myMoney dollars left")

    val wordOfBoss = "You can't drink Dragon's Breath"
    println("a dragon came in, boss says:")
    println(wordOfBoss)
    println("and the dragon says:")
    println("Wh4t? ${toDragonWords(wordOfBoss)}")

    //covert input string to int/float/double
//    println("input dragon breath price")
//    val priceOfDragonBreath = readLine()?.toIntOrNull() ?: 0
    //input 5 / 5.9 / null
//    println("drgon breath takes you $priceOfDragonBreath")

    val wtf = 5.1 - 4.91
    println("float: 5.1 - 4.91 = $wtf")
    println("float(2bit): 5.1 - 4.91 = ${"%.2f".format(wtf)}")
    //format double
    println("float(2bit): 5.1 - 4.91 = ${"%.2f".format(wtf)}")
    //double to int: discard
    println("floatToInt: 5.1 - 4.91 = ${wtf.toInt()}")
    //round to Int: 4d5g to closest int
    println("float(2bit) separate Int: 5.1 - 4.91 = ${wtf.toInt()} + 0. ${(wtf%1*100).roundToInt()}")


}

//split string and extract info from substring
private fun placeOrder(orderData: String): Int {
    val indexOfApostrophe = shopName.indexOf('\'')
    val bossName = shopName.substring(0 until indexOfApostrophe)
    println("boss of $shopName is $bossName")
    /*
    val data = orderData.split(',')
    val orderType = data[0]
    val orderName = data[1]
    val orderPrice = data[2].toInt()
    val orderNum = data[3].toInt()
    */

    //use destructing function of List
    val (orderType, orderName, orderPrice, orderNum) = orderData.split(',')
    val Price = orderPrice.toInt() * orderNum.toInt()
    var reply = "sorry?"

    //string compare
    //Kotlin ----- "==" judge content equality, "===" judges object equality
    //Java ------- ".equals()" judge content, "==" judges object equality

    val forbiddenWine = "Dragon's Breath"
    if (orderName == forbiddenWine) {
        reply = "You can't order Dragon's Breath"
        println(reply)
        return 0
    } else {
        reply = "You ordered $orderNum $orderType names $orderName, takes you $Price in all"
        println(reply)
        return Price
    }
}

//pattern match and char replace
//didnot change original string, created a new string
private fun toDragonWords(phrase: String) =
    phrase.replace(Regex("[aeiouAEIOU]")) {
        when (it.value) {
            "a" -> "4"
            "A" -> "4"
            "e" -> "3"
            "E" -> "3"
            "i" -> "1"
            "I" -> "1"
            "o" -> "0"
            "O" -> "0"
            "u" -> "|_|"
            "U" -> "|_|"
            else -> it.value
        }
    }

