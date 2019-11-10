open class unscSoldier(val name:String) {

    open fun create() {
        println("you have an unsc soldier")
    }

    protected open var squadNum = 4
    open var effect = "normal"

}