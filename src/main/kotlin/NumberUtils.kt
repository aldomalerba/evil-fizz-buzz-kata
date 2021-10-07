class NumberUtils {
    fun isPrime(number: Int) : Boolean {
        if (number == 0 || number == 1) return false
        for(num in 2..number / 2) if (number % num == 0) return false
        return true;
    }

}
