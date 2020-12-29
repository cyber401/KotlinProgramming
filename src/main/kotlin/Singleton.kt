
fun main(args:Array<String>){

    Static.lk()
}

// This is called Singleton Object, it behave like java static properties
// Everything inside Singleton Object have static properties
object Static{
    var name = "lalit";   // its behave like a Static variable

    // Static function
    fun lk(){     // its behave like a Static function
        println(name)
    }
}