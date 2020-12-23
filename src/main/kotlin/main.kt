
fun main(args:Array<String>) {
    // we can assign function RETURN TYPE to VARIABLE directly through FUNCTION
    var a:Int = lalit(2,3);

    // val can't be modified, its like final variable in java
    var constant =3
    // $ sign is use to differentiate VARIABLE from STRING
    println("Hello World!$a")

}

// this is how FUNCTION work in KOTLIN
fun lalit(value:Int, value2:Int) : Int  {
    return(25)
}