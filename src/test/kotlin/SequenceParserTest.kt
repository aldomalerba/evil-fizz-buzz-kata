import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SequenceParserTest {

    @Test
    internal fun `replace with Fizz if divisible by 3`() {

        val parser = SequenceParser()

        val integers = listOf(6,9,12,99)

        for (num in integers)
            assertEquals("Fizz", parser.parse(num))

    }

    @Test
    internal fun `replace with Buzz if divisible by 5`() {

        val parser = SequenceParser()

        val integers = listOf(10,20,40,55,100)

        for (num in integers)
            assertEquals("Buzz", parser.parse(num))

    }

    @Test
    internal fun `replace with FizzBuzz if divisible by 5 and 3`() {

        val parser = SequenceParser()

        val integers = listOf(15,30,60,75,90)

        for (num in integers)
            assertEquals("FizzBuzz", parser.parse(num))

    }
}