fun main() {
    val invitation = readLine().toBoolean() // read other value in the same way
    val invitation2 = readLine().toBoolean()
    val result: Boolean = invitation && invitation2
    println(result)
}