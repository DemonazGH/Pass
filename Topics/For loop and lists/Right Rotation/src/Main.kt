fun main() {
    val size = readln().toInt()
    val numbers = MutableList(size) { readln().toInt() }
    var shift = readln().toInt()
    if (shift > numbers.size) shift = shift % size
    val newList = MutableList(size) { 0 }
    for (item in 0..numbers.lastIndex) {
        if (item + shift <= numbers.lastIndex) {
            newList[item + shift] = numbers[item]
        } else {
            newList[item + shift - numbers.lastIndex - 1] = numbers[item]
        }
    }
    println(newList.joinToString(" "))
}
