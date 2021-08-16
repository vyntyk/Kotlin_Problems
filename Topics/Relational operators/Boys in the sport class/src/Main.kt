fun main() {
    val boy1 = readLine()!!.toInt()
    val boy2 = readLine()!!.toInt()
    val boy3 = readLine()!!.toInt()
    println(boy2 in boy3..boy1 || boy2 in boy1..boy3)
}