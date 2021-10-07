class SequenceParser(private val utils: NumberUtils) {

    fun parse(number: Int) : String {
        var result = ""

        if(number % 3 == 0) result += "Fizz"
        if(number % 5 == 0) result += "Buzz"
        if(utils.isPrime(number)) result += "Wizz"

        return result.ifEmpty { number.toString() }
    }

}
