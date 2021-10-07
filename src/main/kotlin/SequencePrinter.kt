class SequencePrinter(private val parser: SequenceParser) {

    fun print(): String  {
        val sequence = sequence()
        return sequence.joinToString(", ")
    }

    private fun sequence(): MutableList<String> {
        val sequence = mutableListOf<String>()
        for (item in 1..100) sequence.add(parser.parse(item))
        return sequence
    }

}
