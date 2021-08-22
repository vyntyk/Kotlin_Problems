fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()

    for (x in 0..1000) {
        if ((a * (x * x * x)) + (b * x * x) + c * x + d == 0) {
            println(x)
        }
    }
}