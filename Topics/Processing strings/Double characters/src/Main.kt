fun main() {
    var newWord = ""
    val line = readln()
    for (i in line) {
        newWord = newWord + i + i
    }
    println(newWord)
}