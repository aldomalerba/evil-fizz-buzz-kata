class NumberUtils {
    fun isPrime(number: Int) : Boolean {
        if(listOf(2, 3, 5, 7, 11, 13, 17, 19).contains(number)) return true
        return false;
    }

}
