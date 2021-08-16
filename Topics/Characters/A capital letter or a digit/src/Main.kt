fun main() {
    val ch = readLine()!!.first()
    println(ch in 'A'..'Z' || ch in '1'..'9')
}