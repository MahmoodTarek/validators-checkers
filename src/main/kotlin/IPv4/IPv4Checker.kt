package IPv4

fun main() {
    // Valid Cases
    checkTestCases(
        name = "When IPv4 address is in standard format then return true",
        result = isValidIPv4("255.124.0.1"),
        correctResult = true
    )
    // Invalid Cases
    checkTestCases(
        name = "When we have a value out of range then return false",
        result = isValidIPv4("192.168.5.256"), // 256 is out of range (0-255)
        correctResult = false
    )
    checkTestCases(
        name = "When we have any char in the IPv4 then return false",
        result = isValidIPv4("192.168.a.1"), // contains a letter
        correctResult = false
    )
    checkTestCases(
        name = "When IPv4 has less than four parts then return false",
        result = isValidIPv4("192.168.1"), // Only 3 parts instead of 4
        correctResult = false
    )
    checkTestCases(
        name = "When IPv4 has more than four parts then return false",
        result = isValidIPv4("192.168.1.1.5"), // 5 parts instead of 4
        correctResult = false
    )
    checkTestCases(
        name = "When IPv4 has extra dots then return false",
        result = isValidIPv4("192..168.1.1"), // Two consecutive dots
        correctResult = false
    )
    checkTestCases(
        name = "When IPv4 has leading zero in any part then return false",
        result = isValidIPv4("192.168.01.1"), // "01" is not allowed
        correctResult = false
    )
    checkTestCases(
        name = "When IPv4 contains spaces then return false",
        result = isValidIPv4(" 192.168.1.1 "), // Spaces around the address
        correctResult = false
    )
    checkTestCases(
        name = "When IPv4 contains an Empty section then return false",
        result = isValidIPv4("192.168.1."), //last section is empty
        correctResult = false
    )
    checkTestCases(
        name = "When IPv4 is empty then return false",
        result = isValidIPv4(""), // Empty string
        correctResult = false
    )
    checkTestCases(
        name = "When IPv4 contains negative numbers then return false",
        result = isValidIPv4("192.-168.1.1"), // Negative number is not valid
        correctResult = false
    )
    checkTestCases(
        name = "When IPv4 contains a floating number then return false",
        result = isValidIPv4("192.168.1.1.0"), // More than 4 sections
        correctResult = false
    )//
}


fun checkTestCases(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult)
        println("Success:$name")
    else
        println("Failed: $name (Expected: $correctResult, Got: $result)")
}