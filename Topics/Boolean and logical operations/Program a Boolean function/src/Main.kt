fun main(args: Array<String>) {
    val x = readLine().toBoolean()
    val y = readLine().toBoolean()
    val z = readLine().toBoolean()
    val result: Boolean = !(x && y) || z
    println(result)
}