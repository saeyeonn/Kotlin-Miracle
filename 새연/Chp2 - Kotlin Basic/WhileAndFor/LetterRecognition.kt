package WhileAndFor

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A' .. 'Z'
fun isNotDigit(c: Char) = c !in '0'.. '9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It is a digit"
    in 'a'..'z', in 'A'..'Z' -> "It is a letter"
    else -> "I don't know"
}

fun main() {
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}