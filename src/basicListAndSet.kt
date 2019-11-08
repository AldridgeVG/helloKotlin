import java.io.File

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
    val nameList = mutableListOf("echo", "bravo", "alpha", "foxtrot", "lima", "charlie")
    someList.removeIf { it == 0 }   //delete all 0
    println(someList)
    println(nameList)
    println("delete all words containing letter o")
    nameList.removeIf { it.contains("o") }
    println(nameList)

    //6.clear, clean whole list, list become "[]"
    nameList.clear()
    someList.clear()
    print("two empty lists: $nameList $someList")
    println()

    //Traverse List
    //for
    val aList = mutableListOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)
    for (a in aList) {
        print("$a\t")
    }   //here a is just name, will be predicted to be Int
    println()

    //foreach
    aList.forEach { a ->
        print("$a\t")
    }
    println()

    //foreach indexed
    aList.forEachIndexed { index, a ->
        print("No.${index + 1} is $a\t")
    }
    println()

    //read file and store each line as list
    val bList = File("test1.txt").readText().split("\n")
    bList.forEachIndexed { index, b ->
        println("line ${index + 1}: $b")    //add a '\t' in the end cause empty read -- WHY?
    }

    //decompose
    //decompose a list to get first FIVE elem
    val cList = listOf(1, 2, 3, 4, 5, 6)
    val (one, two, _, four) = cList
    println("one = $one, two = $two, four = $four")
    //decompose a string to get substring list
    val place = "China,Sichuan,Chengdu,Home"
    val (A, B, _, D) = place.split(',')
    println("$A $B $D")


    //SET --- non-duplicated elem
    //duplicated elem will be deleted automatically
    println()
    val setOfPlanet = setOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Earth")
    setOfPlanet.forEach { planetName ->
        println(planetName)
    }

    //get elem in set - elementAt()
    //very slow --- search elem by index recommend using LIST
    println("No.3 closest to the sun: ${setOfPlanet.elementAt(2)}")

    //add to set
    val dList = listOf("Claymore", "Alpha", "Bravo", "Noble", "Claymore")
    val soldierSet = mutableSetOf("Claymore", "Pride", "Noble", "Devil")
    println(soldierSet)
    //add,addAll,+=,-=,remove,removeAll,clear
    soldierSet+="Gavin"
    println(soldierSet)
    soldierSet.addAll(dList)
    println(soldierSet)
    soldierSet.remove("Claymore")
    println(soldierSet)
    soldierSet.clear()
    println("soldierSet: $soldierSet")



    //control non +1 loop: while
    println()
    val threeLoopList = mutableListOf(1,1,1,3,3,3,5,5,5,7,7,7,9,9,9)
    var count =0
    while(count<15){
        if (threeLoopList[count] == 5)
            break
        else {
            print(threeLoopList[count])
            print("\t")
            count += 3
        }
    }
    println()
}