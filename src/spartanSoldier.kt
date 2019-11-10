import java.io.File

class spartanSoldier(
    val name: String,
    var defs: Int = 5,
    var health: Int = 100,
    var status: String = "strong"
//    val weaponList: MutableList<String> = mutableListOf("DMR", "Sparta laser", "BR", "AR")
) {
    init {
        require(health > 0 && health <= 100, { "initiating soldier failure due to illegal hp" })
    }

    //delaying initialization
    var weapon = selectWeapon()
    var attk = when (weapon) {
        "Sparta laser" -> 10
        "Rocket launcher" -> 9
        "DMR" -> 6
        "Sniper rifle" -> 8
        "BR" -> 7
        "AR" -> 3
        "Gravity hammer" -> 11
        "Plasma sword" -> 10
        "SMG" -> 5
        "Mag pistol" -> 4
        else -> 7
    }

    fun selectWeapon(): String {

        //---------------------------------------------------------//
        //be aware: use split get lines must use /r/n instead of /n
        //---------------------------------------------------------//

        return File("weapon.txt").readText().split("\r\n").shuffled().first()
//        return weaponList!!.shuffled()!!.first()
    }

    fun showStatus() {
        status = when (health) {
            in 0..20 -> "dying"
            in 21..50 -> "weak"
            in 51..80 -> "normal"
            in 81..100 -> "strong"
            else -> "?"
        }

        println("soldier: $name status: $status")
        println("weapon: $weapon")
        println("health: $health, attk: $attk, defs: $defs")

    }

    //sub constructor
    constructor(name1: String, health1: Int, status1: String) : this(name1, health = health1, status = status1)

}