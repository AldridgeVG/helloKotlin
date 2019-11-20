fun main(args: Array<String>) {
    val ODST = unscODST()
    ODST.create()
    ODST.printODST()

    //use companion obj fun member
    unscSoldier.sodldierRace()

    //1. object expression
    val deadODST = object : unscODST() {
        override fun create() {
            println("this ODST is dead due to drop failure")
        }

        override var effect: String = "dead"
            get() = field.capitalize()

        override fun printODST() {
            println("this $name is $effect")
        }
    }

    //2.use external object
    planetReach.creatHumanForce()

    //operator overload test
    var macCoo0 = planetReach.macGunCooridinate(2,2,2)+planetReach.macGunCooridinate(1,1,1)
    var macCoo1 = planetReach.macGunCooridinate(2,2,2)-planetReach.macGunCooridinate(1,1,1)
    val macCoo2 = planetReach.macGunCooridinate(3,3,3)
    println("mac0:"+macCoo0.toString())
    println("mac1:"+macCoo1.toString())
    val b1 = macCoo0 == macCoo2
    println(b1)

}

object planetReach {

    var num = 10
    private fun numOfForce() {
        println("we create a human force numbers $num")
    }

    fun creatHumanForce() {
        var i = num
        //array of class unscODST
        var ODST: Array<unscODST?> = arrayOfNulls(i)
        while (i > 0) {
            ODST[i - 1] = unscODST()
            ODST[i - 1]!!.create()
            ODST[i - 1]!!.printODST()
            i--
        }
    }

    data class macGunCooridinate(val x: Int, val y: Int, val z: Int) {
        val validity = x>=0 &&y>=0&&z>=0
        operator fun plus(other:macGunCooridinate) = macGunCooridinate(x+other.x,y+other.y,z+other.z)
        operator fun minus(other:macGunCooridinate) = macGunCooridinate(x-other.x,y-other.y,z-other.z)
        /*
        + -------- plus
        - -------- minus
        += ------- plusAssign
        == ------- equals
        > -------- compareTo
        [] ------- get
        .. ------- rangeTo
        in ------- contains
        */
        //operators above can be overloaded
    }

}