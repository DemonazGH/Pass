package tictactoe

fun main() {
    print("Enter cells:")
    val line = readln().take(9)
    val cells = line.toList().windowed(3,3)
    println(line.replaceFirst('o', 'O'))
        //val gamFld = mutableListOf(
//        mutableListOf(line[0], line[1], line[2]),
//        mutableListOf(line[3], line[4], line[5]),
//        mutableListOf(line[6], line[7], line[8])
//    )
//    printingField(line)
//    println(result(gamFld))
//}
//
//fun printingLine(
//    firstElement: Char,
//    secondElement: Char,
//    thirdElement: Char
//) {
//    println(
//        "|" + " " + firstElement + " " + secondElement +
//                " " + thirdElement + " " + "|"
//    )
}

//fun printingField(list: String) {
//    var cou = 0
//    println("---------")
//    for (a in 1..3) {
//        printingLine(list[cou], list[cou + 1], list[cou + 2])
//        cou += 3
//    }
//    println("---------")
//}
//
//fun checkWin(fld: MutableList<MutableList<Char>>, side: Char): Boolean {
//    return fld[0][0] == side && fld[0][1] == side && fld[0][2] == side ||
//            fld[1][0] == side && fld[1][1] == side && fld[1][2] == side ||
//            fld[2][0] == side && fld[2][1] == side && fld[2][2] == side ||
//            fld[0][0] == side && fld[1][1] == side && fld[2][2] == side ||
//            fld[0][2] == side && fld[1][1] == side && fld[2][0] == side ||
//            fld[0][0] == side && fld[1][0] == side && fld[2][0] == side ||
//            fld[0][2] == side && fld[1][2] == side && fld[2][2] == side ||
//            fld[0][1] == side && fld[1][1] == side && fld[2][1] == side
//
//}
//
//fun emptyCellCount(fld: MutableList<MutableList<Char>>): Boolean {
//    var counter = 0
//    for (item in fld) {
//        for (element in item) {
//            when (element) {
//                '_' -> counter++
//            }
//        }
//    }
// return counter == 0
//}
//
//fun itemCounterChk(fld: MutableList<MutableList<Char>>): Boolean {
//
//    var xCounter = 0
//    var oCounter = 0
//    for (item in fld) {
//        for (element in item) {
//            when (element) {
//                'X' -> xCounter++
//                'O' -> oCounter++
//            }
//        }
//    }
//    return abs(xCounter - oCounter) <= 1
//}
//
//fun result(fld: MutableList<MutableList<Char>>): String =
//            if (checkWin(fld, 'X') && !checkWin(fld, 'O')) {
//            "X wins"
//        } else {
//            if (checkWin(fld, 'O') && !checkWin(fld, 'X')) {
//                "O wins"
//            } else {
//                if (!itemCounterChk(fld) ||
//                    checkWin(fld, 'X') && checkWin(fld, 'O')
//                ) {
//                     "Impossible"
//                } else {
//                    if (!checkWin(fld, 'O') && !checkWin(fld, 'X') &&
//                        itemCounterChk(fld) && !emptyCellCount(fld)
//                    ) {
//                         "Game not finished"
//                    } else {
//                         "Draw"
//                    }
//                }
//            }
//        }
//
