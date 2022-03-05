fun main() {
    var sum1 = 0
    var sum2 = 0
    val input = readln().toString()
    for (i in 0..input.length / 2 - 1) {
        sum1 += input[i].digitToInt()
    }
    for (i in input.length / 2..input.lastIndex) {
        sum2 += input[i].digitToInt()
    }
    println(if (sum1 == sum2) "YES" else "NO")
}