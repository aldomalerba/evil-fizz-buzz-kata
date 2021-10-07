import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class NumberUtilsTest {
    @Test
    internal fun `is prime number`() {

        val integers = listOf(179, 419, 1033, 1297)
        for(num in integers) assertTrue(NumberUtils().isPrime(num))

    }
}