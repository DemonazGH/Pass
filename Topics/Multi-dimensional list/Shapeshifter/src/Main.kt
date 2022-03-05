fun main() {
    // Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    // write your code here
    val newList: MutableList<MutableList<String>> = mutableListOf()
    newList.add(inputList.reversed()[0])
    newList.add(inputList.reversed()[n - 1])
    println(newList)
}