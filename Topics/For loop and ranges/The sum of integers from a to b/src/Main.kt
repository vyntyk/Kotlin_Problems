fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var summ: Int = 0
    for (i in a..b) {
        summ += i
    }
    println(summ)
}