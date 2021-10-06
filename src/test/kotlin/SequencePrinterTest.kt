import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SequencePrinterTest {


    @Test
    internal fun `should return 100 items`() {

        val printer = SequencePrinter(SequenceParser())

        assertEquals(99, printer.print().count{ it == ',' })

    }

    @Test
    internal fun `call sequence parse`() {

        val parser = mockk<SequenceParser>(relaxed = true)
        every { parser.parse(any()) } returns "Test"

        val printer = SequencePrinter(parser)

        assertEquals(100, printer.print().split(",").count{ it == "Test"})

    }
}