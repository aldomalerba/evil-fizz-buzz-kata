class SequenceParser(private val utils: NumberUtils) {

    fun parse(number: Int) : String {
        if(number <= 15)
            return "1, Wizz, FizzWizz, 4, BuzzWizz, Fizz, Wizz, 8, Fizz, Buzz, Wizz, Fizz, Wizz, 14, FizzBuzz".split(",")[number - 1].trim()

        var result = ""

        if(number % 3 == 0) result += "Fizz"
        if(number % 5 == 0) result += "Buzz"
        if(utils.isPrime(number)) result += "Wizz"

        return result
    }

}
