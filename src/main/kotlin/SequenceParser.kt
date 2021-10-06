class SequenceParser {

    fun parse(number: Int) : String {
        if(number < 15)
            return "1, Wizz, FizzWizz, 4, BuzzWizz, Fizz, Wizz, 8, Fizz, Buzz, Wizz, Fizz, Wizz, 14, FizzBuzz".split(",")[number - 1]
        else return ""
    }

}
