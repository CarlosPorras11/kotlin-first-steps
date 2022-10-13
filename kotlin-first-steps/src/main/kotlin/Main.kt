fun main(args: Array<String>) {
    val a: Int = 23
    val st = Student(
        "Bob",
        "Esponja",
        23,
        15497
    )
    val st2 = st.copy(
        "Pepe",
        "Viyuela",
        47,
        25157
    )

    println("Hello World! ${st2.prettyPrint()} $a clicks")

    val numbers = arrayOf(3, 4, 5)
    println(numbers[2])
    for (number in numbers) {
        println(number)
    }

    val res: Int = Calculator.sum(57, 10)
    println(res)

    val student: Student? = null /*Sin interrogante no es posible null al estudiante*/

    fun printStudent(student: Student?) {
        if (student != null) {
            println(student.surname)
        } else {
            println("Estudiante null")
        }
    }
}