data class Student(
    val name: String,
    val surname: String,
    val age: Int,
    val zipcode: Int
) {

    fun prettyPrint(): String {
        return ("Nombre: $name, " +
                "Apellido: $surname, " +
                "Edad: $age, " +
                "Codigo Postal: $zipcode")
    }
}




