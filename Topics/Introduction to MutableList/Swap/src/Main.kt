fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    val mediatorFirst = numbers.first()
    val mediatorLast = numbers.last()
    numbers[0] = mediatorLast
    numbers[numbers.size - 1] = mediatorFirst
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}
