fun getGreatings (greetingWord:String,greetingTarget:String) = "$greetingWord $greetingTarget"

fun printGreeting (greetingStatement:String) = println(greetingStatement)

fun greatGroup (greatingWord:String, vararg greatingTargets:String) = greatingTargets.forEach { greatingTarget:String -> printGreeting(getGreatings(greatingWord,greatingTarget)) }

fun main(args: Array<String>) {
    val person = Person("Adham","Nour")
    person.neckName="Mobile Developer"
    greatGroup("Hi",person.firstName,person.lastName,person.neckName.toString())

}