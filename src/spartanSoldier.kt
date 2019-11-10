class spartanSoldier(
    val name: String,
    var attk: Int = 7,
    var defs: Int = 5,
    public var health: Int = 100,
    public var status: String = "strong"
) {
    init {
        require(health > 0 && health <= 100, { "initiating soldier failure due to illegal hp" })
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
        println("health: $health, attk: $attk, defs: $defs")
    }

    //sub constructor
    constructor(name1: String, health1: Int, status1: String) : this(name1, health = health1, status = status1)

}