fun main() {
    val beyondTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    val backFromTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    // do not touch the lines above
    // write your code here
    println(beyondTheWall.contentEquals(backFromTheWall))
    println(beyondTheWall.equals())
}