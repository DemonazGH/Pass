fun main() {

    val backFromTheWall = readLine()!!.toString()
    val finalList = mutableListOf<Int>()
    val numbersList = backFromTheWall.map { it }.toMutableList()
    for (word in numbersList) {
        var number = word.toString().toInt()
        finalList.add(number * number)
        //print(number*number)
    }
//    val returnedWatchman = readLine()!!
//    backFromTheWall.add(returnedWatchman)
    println(finalList.joinToString(""))
    finalList.forEach { println(it)}
    println(113.toChar())
}