fun main() {
    val firstList = readLine()!!.split(' ').map { it }.toMutableList()
    val secondList = readLine()!!.split(' ').map { it }.toMutableList()
    val thirdList = firstList + secondList
    println(thirdList.joinToString())
}