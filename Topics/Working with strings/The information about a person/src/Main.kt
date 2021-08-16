fun main() {
    val (name, forename, year) = readLine()!!.split(' ')

    println(name.first() + ". " + forename + ", " + year + " years old")
}