import java.lang.*
import java.lang.Integer.max

fun Fight(squad1: spartanSquad, squad2: spartanSquad): Int {
    squad2.squadHP -= max(squad1.squadAttk - squad2.squadDefs, 0)
    if (squad2.squadHP < 0) {
        squad2.squadHP = 0
        println("${squad1.name} squad win!")
        return 1    //2 win
    }

    squad1.squadHP -= max(squad2.squadAttk - squad1.squadDefs, 0)
    if (squad1.squadHP < 0) {
        squad1.squadHP = 0
        println("${squad2.name} squad win!")
        return 2    //2 win
    }

    return 0
}

fun main(args: Array<String>) {
    val name1 = "noble"
    val name2 = "raven"
    var sq1 = spartanSquad(name1)
    sq1.calcAttk()
    sq1.clacDefs()
    sq1.clacHP()
    var sq2 = spartanSquad(name2)
    sq2.calcAttk()
    sq2.clacDefs()
    sq2.clacHP()
    sq1.showStatus()
    sq2.showStatus()
    while (Fight(sq1, sq2) == 0) {
        sq1.showStatus()
        sq2.showStatus()
    }
    println("over")
}