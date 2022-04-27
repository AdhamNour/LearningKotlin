interface PersonalInfoProvider {
    val providerInfo:String;
    fun printInfo(person: Person){
        println("Invoked from PersonalInfoProvider Interface")
        println("usedby $providerInfo")
        person.printInfo()
    }
}

class BasicInfoProvider : PersonalInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProbider"

}

fun main() {
    val bip:BasicInfoProvider = BasicInfoProvider()
    bip.printInfo(Person("Adham","Nour"))
}