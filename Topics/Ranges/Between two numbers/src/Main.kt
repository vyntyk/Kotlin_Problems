fun main() {
    // write your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val within = a in b..c
    println(within)
}