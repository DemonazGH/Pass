fun main() {
    val size = readln().toInt()
    val numbers = MutableList(size) { readln() }
    val match = readln()
    var counter = 0
    for (element in numbers) {
        if (element == match) {
            counter++
        }
    }
    println(counter)
}