import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.nio.charset.Charset
import kotlin.test.assertTrue

class AcceptanceTests {

    @Test
    internal fun `the firsts 15 characters should be correct`() {

        val program = FizzBuzz()
        program.print()
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream, true))

        program.print()

        assertTrue(outputStream.toString(Charset.defaultCharset())
            .startsWith("1, Wizz, FizzWizz, 4, BuzzWizz, Fizz, Wizz, 8, Fizz, Buzz, Wizz, Fizz, Wizz, 14, FizzBuzz"))

    }
}