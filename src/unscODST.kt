class unscODST: unscSoldier("ODST") {

    override fun create() {
        println("You have an ODST: orbital drop shock trooper")
        println("Gear up ODSTs! show me some strength. It's hell that we are dropping to")
    }

    override var squadNum = 6
    override var effect: String = "astonishing"
        //capitalize first letter of effect
        get() = field.capitalize()
    fun printODST(){
        println("$name has an effect of: $effect")
    }
}