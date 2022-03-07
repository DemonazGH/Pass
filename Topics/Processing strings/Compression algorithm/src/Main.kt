fun main() {
    var input = readlnOrNull()
    input += "."
    var result = ""
    if (input != null) {
        Loop1@ for (i in input.indices) {
            if (i > 0 && input[i] == input[i - 1]!!) {
                continue@Loop1
            } else {
                result += processing(input, result, i)
            }
        }
    }
    println(result)

}

/*
Cunting symbol's in occurances
 */
fun processing(input: String, result: String, i: Int): String {
    var result1 = ""
    var counter = 1
    Loop2@ for (z in i + 1..input.lastIndex) {
        if (input[i] == input[z]) {
            counter++
        } else if (input[i] != input[z] || input[z].equals(".")) {
            result1 += "${input[i]}$counter"
            break@Loop2
        }
    }
    return result1
}