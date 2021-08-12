// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val isClosingSoon:Boolean = false
    val isNear: Boolean = false

    println(isClosingSoon && isNear)
    println(!isClosingSoon && isNear)
    println (!isClosingSoon || isNear)
    println( isClosingSoon xor isNear)
    println(isClosingSoon || !isNear)
}
