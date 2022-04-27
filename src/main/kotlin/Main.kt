fun getGreatings (greetingWord:String,greetingTarget:String) = "$greetingWord $greetingTarget"

fun printGreeting (greetingStatement:String) = println(greetingStatement)

fun greatGroup (greatingWord:String, greatingTargets:List<String>) = greatingTargets.forEach { greatingTarget:String -> printGreeting(getGreatings(greatingWord,greatingTarget)) }

fun main(args: Array<String>) {
    val groupOfGreeting:List<String> = listOf("Ahmed","Mohammed","Samir","Zaid")
    greatGroup("Hi",groupOfGreeting);
}