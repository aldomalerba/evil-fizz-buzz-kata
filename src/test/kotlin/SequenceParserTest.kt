import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SequenceParserTest {

    private val utils = mockk<NumberUtils>(relaxed = true)
    private val parser = SequenceParser(utils)

    @Test
    internal fun `replace with Fizz if divisible by 3`() {

        val integers = listOf(6,9,12,99)

        for (num in integers)
            assertEquals("Fizz", parser.parse(num))

    }

    @Test
    internal fun `replace with Buzz if divisible by 5`() {

        val integers = listOf(10,20,40,55,100)

        for (num in integers)
            assertEquals("Buzz", parser.parse(num))

    }

    @Test
    internal fun `replace with FizzBuzz if divisible by 5 and 3`() {

        val integers = listOf(15,30,60,75,90)

        for (num in integers)
            assertEquals("FizzBuzz", parser.parse(num))

    }

    @Test
    internal fun `concatenate Wizz if prime number`() {

        val integers = listOf(2, 3, 5, 7, 11, 13, 17)

        every { utils.isPrime(match{ integers.contains(it) }) } returns true;

        for (num in integers)
            assertTrue(parser.parse(num).endsWith("Wizz"))

    }
}