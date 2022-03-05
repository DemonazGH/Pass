fun main() {
    var counter = 0
    val size = readln().toInt()
    val numbers = MutableList(size) { readln() }
    val numbersNew = numbers.joinToString(" ")
    val match = readln()
    if (numbersNew.contains(match) || numbersNew.contains(match.reversed()))
        println("NO") else println("YES")
}
