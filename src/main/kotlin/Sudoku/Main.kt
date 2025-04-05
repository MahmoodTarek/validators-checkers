package Sudoku

fun main() {}

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