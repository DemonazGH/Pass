fun main() {
    val input = readln().split(" ").toMutableList().map { it.toInt() }.toMutableList()
    val upperCase = ('A'..'Z').toMutableList().map { it.toString() }.toMutableList()
    val lowerCase = ('a'..'z').toMutableList().map { it.toString() }.toMutableList()
    val digits = (0..9).toMutableList().map { it.toString() }.toMutableList()
    var result = ""
    val dif = input[3] - input.slice(0..2).sum()
    val k = 0..2
    for (i in 1..input.slice(0..2).sum()) {
        when (checkAvail(input, result, k)) {
            0 -> {
                checkPresence(result, upperCase)
                result += checkPresence(result, upperCase)
                input[0] = input[0] - 1
            }
            1 -> {
                result += checkPresence(result, lowerCase)
                input[1] = input[1] - 1
            }
            2 -> {
                result += checkPresence(result, digits)
                input[2] = input[2] - 1
            }
        }
    }
    if (dif > 0) {
        repeat(dif) {
            result += checkPresence(result,(upperCase + lowerCase + digits).toMutableList())
        }
    }
    println(result)

}
/*
This function check if the current symbol does not match with previous
symbol in the string
 */
fun checkPresence(result: String, symbolsLine: MutableList<String>): String {
    var retString = ""
    if (result.isEmpty()) {
        retString = symbolsLine.random()
    } else {
        var k = 0
        while (k < 1) {
            retString = symbolsLine.random()
            if (result.last().toString() == retString) {
                k = 0
            } else k = 1
        }
    }
    return retString
}

/*
function checks if given limit of each type of characters is not exceeded
 */
fun checkAvail(input: MutableList<Int>, result: String, k: IntRange): Int {
    var count = 0
    var chk = 0
    while (chk <= 1) {
        count = k.random()
        if (input[count] == 0) {
            chk = 0
        } else {
            chk = try {
                if (result[count] == result[count - 1] ||
                    result[count] == result[count - 1] && result[count - 1].toString() != ""
                ) {
                    0
                } else 2
            } catch (e: IndexOutOfBoundsException) {
                2
            }
        }
    }
    return count
}
