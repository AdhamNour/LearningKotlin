fun getGreatings (greetingWord:String,greetingTarget:String) = "$greetingWord $greetingTarget"

fun printGreeting (greetingStatement:String) = println(greetingStatement)


fun main(args: Array<String>) {
    var greetingWord:String = "Hello"
    var greetingTarget:String = "World"
    printGreeting(getGreatings(greetingWord,greetingTarget));
}