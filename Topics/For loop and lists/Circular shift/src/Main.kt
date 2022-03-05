import java.util.*

fun main() {
    val size = readln().toInt()
    val numbers = MutableList(size) { readln().toInt() }
    val nlist = numbers.toList()
    Collections.rotate(nlist, 1)
    println(nlist.joinToString(" "))
}
