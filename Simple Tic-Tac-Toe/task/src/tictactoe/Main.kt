package tictactoe

var playerCounter = 1
fun main() {
    val gamFld = MutableList(3) { MutableList(3, { ' ' }) }
    printingField(gamFld)
    while (result(gamFld).length > 6) {
        moveCheck(gamFld)
        printingField(gamFld)
    }
    println(result(gamFld))
}

/*
player's move input primary processing function
 */
fun moveCheck(gamFld: MutableList<MutableList<Char>>) {
    var k = 0
    while (k == 0) {
        val input = playerInput()
        k = if (!checkInput(input, gamFld)) {
            0
        } else {
            1
        }
    }
}

/*
Checking the player's move for availability
 */
fun checkInput(input: List<String>, gamFld: MutableList<MutableList<Char>>): Boolean {
    var k = 0
    if (input.lastIndex < 1) {
        return k == 1
    }
    if (input[0].matches("\\d+?".toRegex()) && input[1].matches("\\d+?".toRegex())) {
        val y = input[0].toInt() - 1
        val x = input[1].toInt() - 1
        if (input[0].toInt() <= 3 && input[1].toInt() <= 3) {
            if (gamFld[y][x] == ' ') {
                if (playerCounter % 2 > 0) {
                    gamFld[y][x] = 'X'
                } else {
                    gamFld[y][x] = 'O'
                }
                k = 1
                playerCounter++
            } else {
                println("This cell is occupied! Choose another one!")
            }
        } else {
            println("Coordinates should be from 1 to 3!")
        }
    } else {
        println("You should enter numbers!")
    }
    return k == 1
}

/* Player's input dialog */
fun playerInput(): List<String> {
    print("Enter the coordinates:")
    val input = readln().split(" ")
    return input
}

/*
Prints game field
 */
fun printingField(gamFld: MutableList<MutableList<Char>>) {
    println("---------")
    for (i in gamFld) {
        print("| ${i.joinToString(" ")} |")
        println()
    }
    println("---------")
}

/*
Checks if smb win
 */
fun checkWin(fld: MutableList<MutableList<Char>>, side: Char): Boolean {
    return if (playerCounter < 5) false
    else fld[0][0] == side && fld[0][1] == side && fld[0][2] == side
            || fld[1][0] == side && fld[1][1] == side && fld[1][2] == side
            || fld[2][0] == side && fld[2][1] == side && fld[2][2] == side
            || fld[0][0] == side && fld[1][1] == side && fld[2][2] == side
            || fld[0][2] == side && fld[1][1] == side && fld[2][0] == side
            || fld[0][0] == side && fld[1][0] == side && fld[2][0] == side
            || fld[0][2] == side && fld[1][2] == side && fld[2][2] == side
            || fld[0][1] == side && fld[1][1] == side && fld[2][1] == side
}

/*
Prints game state
 */
fun result(fld: MutableList<MutableList<Char>>): String =
    if (checkWin(fld, 'X') && !checkWin(fld, 'O')) {
        "X wins"
    } else {
        if (checkWin(fld, 'O') && !checkWin(fld, 'X')) {
            "O wins"
        } else {
            if (playerCounter > 9) {
                "Draw"
            } else "Nothing"
        }
    }
