fun main(args: Array<String>) {

    //List ,Set, Map : can be var or val
    //List :allow duplicated elem
    val ocupList = listOf("Warrior", "Priest", "Hunter", "Warlock", "Paladin", "Druid", "Mage", "Rogue")
    println(ocupList)

    //getOrElse, getOrNull -- safe index function
    println("second:${ocupList[1]}")
    println("fifth: ${ocupList.getOrElse(7) { "unknown" }}")   //get index4(5th), outofbound the unknown
    println("first: ${ocupList.first()}")
    println("last: ${ocupList.last()}")

    //contains
    println("is Hunter in the list?")
    if (ocupList.contains("Hunter")) println("Yes")
    else println("No")

    //contains all
    println("are Mage, Rouge and Warlock in the list?")
    if (ocupList.containsAll(listOf("Mage", "Warlock", "Rogue"))) println("Yes")
    else println("No")

    //listOf --- create immutable list
    //mutableListOf --- create mutable list (val and var has no effect)
    //create int mutable list
    val someList = mutableListOf(1, 3, 5, 7, 9, 2, 4, 6, 8)
    val otherList = listOf(0, 0, 0, 11, 13, 15, 17, 19)
    println(someList)
    //mutator function

    //1. add(add at tail or certain index)
    someList.add(0)
    println(someList)
    someList.add(1, 0)
    println(someList)

    //2.assign(replace certain index value with assignment value)
    someList[0] = 3
    println(someList)

    //3.addAll
    someList.addAll(someList.size - 1, otherList)  //add before 0
    println(someList)

    //4.+=/-=, add or delete an elem fro list
    someList += 10    //add a 10 in the tail
    println(someList)
    someList -= 0     //delete the first 0 in the list
    println(someList)

    //5.removeIf, remove elem following order of lambda
    val nameList = mutableListOf("echo","bravo","alpha","foxtrot","lima","charlie")
    someList.removeIf{it == 0}   //delete all 0
    println(someList)
    println(nameList)
    println("delete all words containing letter o")
    nameList.removeIf { it.contains("o") }
    println(nameList)

    //6.clear, clean whole list, list become "[]"
    nameList.clear()
    someList.clear()
    print("two empty lists: $nameList $someList")


    //Traverse List
}