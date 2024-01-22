package data

class Note(title: String) {

    var title: String = title // initialize constructor primary with properties

        // getter
        get() {
            println("call getter function")
            return field // field is keyword from reference var title
        }
    // get() = field

        // setter
        set(value) {
            println("call setter function")
            if (value.isNotBlank()) {
                field = value
            } else {
                println("null")
            }
        }

}