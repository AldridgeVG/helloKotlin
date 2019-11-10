class spartanSquad(
    val name: String = "noble"
) {
    val name1 = name + "1"
    var sp1 = spartanSoldier(name1)
    val name2 = name + "2"
    var sp2 = spartanSoldier(name2)
    val name3 = name + "3"
    var sp3 = spartanSoldier(name3)

    var squadAttk = 0
    var squadDefs = 0
    var squadHP = 0

    fun calcAttk() {
        squadAttk = sp1.attk + sp2.attk + sp3.attk
    }

    fun clacDefs() {
        squadDefs
    }

    fun clacHP() {
        squadHP = sp1.health + sp2.health + sp3.health
    }

    fun showStatus() {
        var squadStatus = when (squadHP) {
            in 0 until 30 -> "broken"
            in 30 until 100 -> "weak"
            in 100 until 250 -> "fighting"
            in 250..300 -> "full tour"
            else -> "?"
        }
        println("$name squad:")
        println("squadHP: $squadHP, status: $squadStatus, attk: $squadAttk")
    }

    fun showSoldierStatus(){
        sp1.showStatus()
        sp2.showStatus()
        sp3.showStatus()
    }
}