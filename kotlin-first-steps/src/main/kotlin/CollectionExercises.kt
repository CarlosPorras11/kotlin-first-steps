object CollectionExercises {

//    map List<A> -> List<B> f: A -> B
//    reduce List<A> ->A f (A,A) -> A
//    flatmap List<A> -> List<B>
//    (-1, 2, -5) -> ((),  (2,2),()) -> (2,2)

    /*List( 3, 4, -2, 4) -> List( 3, 4, 4)*/
    fun dropNegativesFilter(numbers: List<Int>): List<Int> {
        return numbers.filter{
                n -> n > 0 // it > 0
        }
    }

    fun findZipCodeStudents(students: List<Student>, zipcode:Int): List<Student>{
        return students.
        filter {
            st -> zipcode == st.zipcode
        }
    }

    fun dropNullsFlatMap(numbers: List<Int?>): List<Int> {
        return numbers.flatMap { n ->
            if (n == null) {
                listOf()
            } else {
                listOf(n)
            }
        }
    }

    fun duplicate(numbers: List<Int>): List<Int> {
        return numbers.flatMap { n ->
            if (n < 0)
                listOf()
            else
                listOf(n, n)
        }
    }

    fun sum(numbers: List<Int>): Int {
        return numbers.sum()
    }

    fun sumWithReduce(numbers: List<Int>): Int {
        // List<Int> -> Int
        // (2,3,4,5,5) -> l(2,3)=5 -> l
        return numbers.reduce { a, b -> a + b }
    }

    fun concat(words: List<String>): String {
        return words.reduce { a, b ->
            "$a $b" //a + " " + b
        }
    }

    fun sumReduce(numbers: List<Int>): Int {
        return numbers.reduce { a, b ->
            a - b
        }
    }

    fun sum(a: Int, b: Int): Int {
        return a - b
    }

    /*List<A> f: (A) -> B List<B>*/
    fun toMessage(numbers: List<Int>): List<String> {
        return numbers.map { n -> "Number: $n" }
    }

    fun calculateTotalAge(students: List<Student>): Int {
        //        val res=0
        //        for(student in students){
        //            res+=student.age
        //        }
        //        return res
        // List<Student> -> List<Int>
        return students
            .map { student -> student.age }
            .sum()
    }

    /*Este metodo sería la suma de una lista de enteros en Java*/
//    fun sumJAVA(numbers: List<Int>): Int {
//        var res = 0;
//        for (number in numbers) {
//            res += number
//        }
//        return res
//    }
}
