import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SequenceParserTest {

    @Test
    internal fun `replace with Fizz if divisible by 3`() {
        val parser = SequenceParser()

        assertEquals("Fizz", parser.parse(6))
        assertEquals("Fizz", parser.parse(9))
        assertEquals("Fizz", parser.parse(12))
        assertEquals("Fizz", parser.parse(99))

    }
}