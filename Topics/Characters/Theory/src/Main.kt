// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    // put your code here
    val firstArray = readLine()!!.split(' ').map { it }.toTypedArray()
    val secondArray = readLine()!!.split(' ').map { it }.toTypedArray()
    // do not touch the lines above
    // write your code here
    val result = firstArray + secondArray
    println(result.toString())
}
