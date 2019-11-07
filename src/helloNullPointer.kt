fun main(args:Array<String>){

    println("plz input your name:")
    var name = readLine()
//  name can be assigned as null
//    name = null
    println("your name is $name")

    println("input name1:")
    var name1 = readLine()    //use safe call operator "?"
    println("input name2:")
    var name2 = readLine()?.let{            //use safe call operator "let"
        if(it.isNotBlank()) it.capitalize()
        else                "null"
    }
    println("input name3:")
    var name3 = readLine()!!.capitalize()   //strong request to call, if null catch KotlinNullPointerException
    val name4:String = name1!!.capitalize()?:"aldridgeVG"  //use null combine operator - if left of "?:" is null, use right
    println("name1: $name1\nname2: $name2\nname3: $name3\nname4(capt of name 1): $name4")

}
