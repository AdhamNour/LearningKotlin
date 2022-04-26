fun getGreatings (greetingWord:String,greetingTarget:String) = "$greetingWord $greetingTarget"

fun printGreeting (greetingStatement:String) = println(greetingStatement)


fun main(args: Array<String>) {
    var greetingWord:String = "Hello"
    var greetingTarget:String = "World"
    printGreeting(getGreatings(greetingWord,greetingTarget));

    val interstingThings = arrayOf("Kotlin","Programming")
    println(interstingThings.size)
    println(interstingThings[0])

    for (interestingThing in interstingThings){
        println(interestingThing)
    }

    interstingThings.forEach { it:String -> println(it)}

    interstingThings.forEachIndexed { index, s ->  println("$s is at $index")}


}