open class unscSoldier(val name:String) {

    //companion obj - as static class in java
    companion object{
        fun sodldierRace(){
            println("this soldier is a human")
        }
    }

    open fun create() {
        println("you have an UNSC soldier")
    }

    open fun weapon(){
        println("This soldier is equipped with a SMG")
    }

    protected open var squadNum = 4
    open var effect = "normal"

}