object Calculator {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sumNull(a: Int?, b: Int): Int? {
        if (a != null && b != null) {
            return a + b
        } else {
            return null
        }
    }

    fun sumSimplified(a: Int?, b: Int): Int? {
        return a?.plus(b) // if(a!=null) return a.plus(b) else return null
    }

    fun sumSimplifiedII(a: Int?, b: Int): Int? {
        return (a ?: 0).plus(b ?: 0) //Hace una suma que los valores null los convierte a 0
    }

    fun sumNotNull(a: Int?, b: Int): Int? {
        return (a ?: 0) + (b ?: 0) /*El numero que sea null se iguala a 0*/
    }
}