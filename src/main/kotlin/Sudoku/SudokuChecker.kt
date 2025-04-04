package org.example.Sudoku

import Sudoku.isValidSudoku

fun main() {
    testCase(
        name = "When sudoku is valid Then return true",
        result = isValidSudoku(
            arrayOf(
                charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                charArrayOf('6', '-', '-', '1', '9', '-', '-', '-', '-'),
                charArrayOf('-', '2', '8', '-', '-', '-', '-', '4', '-'),
                charArrayOf('2', '-', '7', '-', '-', '-', '-', '-', '3'),
                charArrayOf('4', '-', '-', '8', '-', '-', '-', '-', '1'),
                charArrayOf('9', '-', '-', '-', '5', '-', '-', '-', '6'),
                charArrayOf('-', '6', '-', '-', '-', '-', '2', '-', '-'),
                charArrayOf('-', '-', '-', '4', '-', '1', '-', '-', '5'),
                charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        correctResult = true
    )

    testCase(
        name = "When row has duplicate Then return false",
        result = isValidSudoku(
            arrayOf(
                charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                charArrayOf('6', '-', '-', '1', '9', '-', '-', '-', '-'),
                charArrayOf('-', '2', '8', '-', '-', '-', '-', '4', '-'),
                charArrayOf('2', '-', '7', '-', '-', '-', '-', '-', '3'),
                charArrayOf('4', '-', '-', '8', '-', '9', '-', '-', '1'),
                charArrayOf('7', '-', '-', '-', '5', '-', '-', '-', '6'),
                charArrayOf('-', '6', '-', '-', '-', '-', '2', '-', '-'),
                charArrayOf('-', '-', '-', '4', '-', '1', '-', '-', '5'),
                charArrayOf('-', '-', '-', '-', '-', '7', '-', '7', '9') // 7 in position[8] and [6]
            )
        ),
        correctResult = false
    )

    testCase(
        name = "When column has duplicate Then return false",
        result = isValidSudoku(
            arrayOf(
                charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'), // 7 in position [5] (column)
                charArrayOf('6', '-', '-', '1', '9', '-', '-', '-', '-'),
                charArrayOf('-', '2', '8', '-', '-', '-', '-', '4', '-'),
                charArrayOf('2', '-', '7', '-', '-', '-', '-', '-', '3'),
                charArrayOf('4', '-', '-', '8', '-', '9', '-', '-', '1'),
                charArrayOf('7', '-', '-', '-', '5', '-', '-', '-', '6'),
                charArrayOf('-', '6', '-', '-', '-', '-', '2', '-', '-'),
                charArrayOf('-', '-', '-', '4', '-', '1', '-', '-', '5'),
                charArrayOf('-', '-', '-', '-', '7', '-', '-', '1', '9') // 7 in position [5] (column)
            )
        ),
        correctResult = false
    )

    testCase(
        name = "When 3x3 box has duplicate Then return false",
        result = isValidSudoku(
            arrayOf(
                charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                charArrayOf('6', '-', '-', '1', '9', '-', '-', '-', '-'),
                charArrayOf('-', '2', '8', '-', '-', '-', '-', '4', '-'),
                charArrayOf('2', '-', '7', '-', '-', '-', '-', '-', '3'),
                charArrayOf('4', '-', '-', '8', '-', '9', '-', '-', '1'),
                charArrayOf('-', '-', '-', '5', '-', '-', '-', '-', '6'),
                charArrayOf('-', '6', '-', '-', '-', '-', '7', '-', '-'),// 7 in position [7] (grid 9)
                charArrayOf('7', '-', '-', '4', '-', '1', '-', '-', '5'),
                charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9') // 7 in position [8] (grid 9)
            )
        ),
        correctResult = false
    )

    testCase(
        name = "When sudoku is empty Then return true",
        result = isValidSudoku(
            arrayOf(
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-')
            )
        ),
        correctResult = true
    )
}

fun testCase(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult)
        println("Success: $name")
    else
        println("Failed: $name (Expected: $correctResult, Got: $result)")
}
