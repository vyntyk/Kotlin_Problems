fun main() {
    val ch1: Char = readLine()!!.first()
    val ch2: Char = readLine()!!.first()
    println(ch1.equals(ch2, ignoreCase = true))
}