package org.example


fun main() {
    test(
        name = "Case1:When sudoku is valid Then return true",
        result = isValidSudoku(
            arrayOf(
                "53--7----",
                "6--19----",
                "-28----4-",
                "2-7-----3",
                "4--8----1",
                "9---5---6",
                "-6----2--",
                "---4-1--5",
                "----8--79"
            )
        ),
        correctResult = true
    )

    test(
        name = "Case2:When row has duplicate Then return false",
        result = isValidSudoku(
            arrayOf(
                "53--7----",
                "6--19----",
                "-28----4-",
                "2-7-----3",
                "4--8-9--1",
                "7---5---6",
                "-6----2--",
                "---4-1--5",
                "----7--79" // 7 in position[5] and [8]
            )
        ),
        correctResult = false
    )

    test(
        name = "Case3:When column has duplicate Then return false",
        result = isValidSudoku(
            arrayOf(
                "53--7----",//<- 7 in position [5]
                "6--19----",
                "-28----4-",
                "2-7-----3",
                "4--8-9--1",
                "7---5---6",
                "-6----2--",
                "---4-1--5",
                "----7---9" //<-7 in position [5]
            )
        ),
        correctResult = false
    )

    test(
        name = "Case4:When 3x3 box has duplicate Then return false",
        result = isValidSudoku(
            arrayOf(
                "53--7----",
                "6--19----",
                "-28----4-",
                "2-7-----3",
                "4--8-9--1",
                "----5---6",
                "-6----2--",
                "7--4-1--5", // <- 7 in position [1]
                "----8--79"  // <- 7 in position [8]
            )
        ),
        correctResult = false
    )


    test(
        name = "Case5: Full row, no empty spaces",
        result = isValidSudoku(
            arrayOf(
                "123456789",
                "---------",
                "---------",
                "---------",
                "---------",
                "---------",
                "---------",
                "---------",
                "---------"
            )
        ),
        correctResult = false
    )
    test(
        name = "Case6: Full column, no empty spaces",
        result = isValidSudoku(
            arrayOf(
                "1--------",
                "2--------",
                "3--------",
                "4--------",
                "5--------",
                "6--------",
                "7--------",
                "8--------",
                "9--------"
            )
        ),
        correctResult = false
    )

    test(
        name = "Case7:When sudoku is empty Then return true",
        result = isValidSudoku(
            arrayOf(
                "---------",
                "---------",
                "---------",
                "---------",
                "---------",
                "---------",
                "---------",
                "---------",
                "---------"
            )
        ),
        correctResult = true
    )
}

fun test(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult)
        println("Success: $name")
    else
        println("Failed: $name (Expected: $correctResult, Got: $result)")
}