fun main() {
    val testList = mutableListOf(
        mutableListOf<String>("0", "0", "0"),
        mutableListOf<String>("0", "0", "0"),
    )
    for (i in 0..1) {
        for (z in 0..2) {
            testList[i][z] = "[$i][$z]"
        }
    }
    println(testList)
}