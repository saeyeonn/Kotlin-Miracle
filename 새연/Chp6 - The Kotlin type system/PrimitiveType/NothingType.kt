import java.net.Inet4Address

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main() {
    val address = company.address ?: fail("No address")
    println(address.city)

    fail("Error occurred")
}