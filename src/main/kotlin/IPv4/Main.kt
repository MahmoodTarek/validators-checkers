package IPv4

fun main() {}

fun isValidIPv4(ipv4: String): Boolean {
    val sections = ipv4.split(".")

    if (sections.size != 4) return false

    for (section in sections) {
        when {
            section.length > 1 && section[0] == '0' -> return false // Invalid cuz zero leading
            !section.all { it -> it.isDigit() } -> return false // Invalid cuz section contain char or special char
            !section.isNotEmpty() -> return false
            section.toInt() < 0 || section.toInt() > 255 -> return false
        }
    }
    return true // the Address is Valid
}
