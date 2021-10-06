class SequencePrinter() {
    fun print(): String  {
        val sequence = mutableListOf<Int>()
        for(item in 1..100) sequence.add(item)
        return sequence.joinToString(",")
    }

}
