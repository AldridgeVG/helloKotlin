fun main(args: Array<String>) {

    //Map is formed by K-V pair
    //get elem by key, find relevant value
    val operatorMap = mutableMapOf(
        "Big head" to "Jager",
        "2.5" to "Doc",
        "No head" to "Ash",
        "Fortress" to "Blackbeard",
        "Ghost" to "Caveira"
    )
    println(operatorMap)

    //add duplicated KV pair: replace original kv pair
    operatorMap += "Ghost" to "Vigil"
    println(operatorMap)

    //read value of key
    //[], getValue, getOrElse, getOrDefault
    println("Big Head refers to ${operatorMap["Big head"]}")
    println("Ghost refers to ${operatorMap.getValue("Ghost")}")
    println("2.5 refers to ${operatorMap.getOrElse("2.5") { "else string" }}")
    println("Fortress refers to ${operatorMap.getOrDefault("Fortress", "default string")}")

    //edit kv pairs
    //=, +=, -=, -(return new map), put, putAll, getOrPut, remove, clear
    operatorMap += "Black eye" to "Valkyrie"
    println(operatorMap)
    operatorMap -= "2.5"  //also -
    operatorMap.remove("Ghost")
    println(operatorMap)
    operatorMap.putAll(listOf("2.5" to "Doc", "Ghost" to "Vigil"))
    println(operatorMap)
    operatorMap.getOrPut("Demon"){"Caveira"}
    println(operatorMap)

    


}