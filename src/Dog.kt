class Dog(val name: String, weight_param: Int, breed_param: String) {
    init {
        println("Dog $name has been created.")
    }
    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
    val weightInKgs: Double
        get() = weight/2.2

    val breed = breed_param
    init {
        println("The breed is $breed")
    }

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!!")
    }
}