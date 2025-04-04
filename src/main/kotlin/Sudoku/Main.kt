package Sudoku

fun main() {}


//fun isValidSudoku(board: Array<CharArray>): Boolean {
//    // check there is any duplicate in the row
//    for (row in board) {
//        val seen = mutableSetOf<Char>()
//        for (number in row) {
//            if (number in seen && number != '-') return false
//            else seen.add(number)
//        }
//    }
//    // check there is any duplicate in the column
//    for (column in 0 until 9) {
//        val uniqueNumbers = mutableSetOf<Char>()
//        for (row in 0 until 9) {
//            val num = board[row][column]
//            if (num != '-' && num in uniqueNumbers) return false
//            else uniqueNumbers.add(num)
//        }
//    }
//    // check there is any duplicate in the Grid[3*3]
//    for (startRow in 0 until 9 step 3) {
//        for (startCol in 0 until 9 step 3) {
//            val uniqueNumbers = mutableSetOf<Char>()
//            for (row in startRow until startRow + 3) {
//                for (col in startCol until startCol + 3) {
//                    val currentNum = board[row][col]
//                    if (currentNum != '-' && currentNum in uniqueNumbers) return false
//                    else uniqueNumbers.add(currentNum)
//                }
//            }
//        }
//    }
//    return true
//}

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val uniqueRow = Array(9) { mutableSetOf<Char>() }
    val uniqueColumn = Array(9) { mutableSetOf<Char>() }
    val uniqueGrid = Array(9) { mutableSetOf<Char>() }

    for (row in 0 until 9) {
        for (column in 0 until 9) {
            val gridIndex = (row / 3) + 3 * (column / 3)
            val currentNumber = board[row][column]
            if (currentNumber != '-') {
                if (!uniqueRow[row].add(currentNumber)) return false
                if (!uniqueColumn[column].add(currentNumber)) return false
                if (!uniqueGrid[gridIndex].add(currentNumber)) return false
            }
        }
    }
    return true
}