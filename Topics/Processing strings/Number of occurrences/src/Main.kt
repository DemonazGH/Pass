fun main() {
    val line = readln()
    val match = readln()
    val newWord = line.replace(match, "", false)
    println((line.length - newWord.length) / match.length)
}
