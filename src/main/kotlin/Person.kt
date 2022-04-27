class Person(val firstName:String,val lastName:String) {
    var neckName:String?=null
        set(value) {
            field = value
        }
        get() {
        var field1 = field
        return field1
    }
}