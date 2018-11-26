package hackon.aoc

fun dayInput(day: Int) = SantasLittleHelper::class.java.getResource("day$day").readText()
fun String.intArray() = this.trim().toCharArray().map { it.int }
val Char.int
    get() = this.toString().toInt()

class SantasLittleHelper

inline fun measure(block: () -> Unit) {
    val start = System.nanoTime()
    block()
    println("${(System.nanoTime() - start) / 1000000.0} ms")
}