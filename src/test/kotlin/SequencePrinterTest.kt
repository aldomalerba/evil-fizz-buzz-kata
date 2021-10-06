import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SequencePrinterTest {


    @Test
    internal fun `should return 100 items`() {

        val printer = SequencePrinter()

        assertEquals(99, printer.print().count{ it == ',' })

    }
}