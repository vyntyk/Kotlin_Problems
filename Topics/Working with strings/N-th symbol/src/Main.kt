fun main() {
    val str = readLine()!!.toString()
    val num = readLine()!!.toInt()
    val simbol = str[num - 1]
    print("Symbol # $num of the string \"")
    print(str)
    print("\"")
    print(" is ")
    print('\'')
    print(simbol)
    print('\'')

}