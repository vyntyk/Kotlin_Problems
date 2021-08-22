fun main() {
    // write your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    for (i in a..b) {
        if (i % 15 == 0) {
            println("FizzBuzz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else {
            println(i)
        }

    }
}