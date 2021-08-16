fun main() {
    val e = readLine()!!.toInt()
    if (e % 2 == 0) {
        val result: Int = e + 2
        println(result)
    } else {
        val result: Int = e + 1
        println(result)
    }
}