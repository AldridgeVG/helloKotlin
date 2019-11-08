import java.io.File

fun main(args:Array<String>){

    println("your name:")
    val name = readLine()!!
    name
        .run(::nameIsLong)
        .run(::createMessage)   //former run have a Boolean return, as para of createMessage
        .run(::println)         //former run have a String return, as para of println

//    println(createMessage(nameIsLong(name)))  //traditional way

    //also as "also do(companion op(after order))"
    println("input a string you want to show below")
    val des = readLine()!!
        .also{println(it)}

    //takeIf --- if boolean of lambda(predict) is true then exe
    val fileContent = File("test.txt")
        .takeIf{it.canRead()&&it.canWrite()}?.readText()
    println(fileContent)
}

fun nameIsLong(name:String) = name.length>=20   //indicate return Boolean

fun createMessage(nameTooLong:Boolean): String{
    return if (nameTooLong) {
        "Name too long"
    } else {
        "welcome"
    }
}


