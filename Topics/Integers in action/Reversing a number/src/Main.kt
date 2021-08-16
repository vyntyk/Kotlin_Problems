fun main() {
    val number = readLine()!!.toInt()
    println(number % 10 * 100 + number / 10 % 10 * 10 + number / 100)
}