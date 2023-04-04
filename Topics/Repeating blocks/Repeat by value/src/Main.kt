fun main() {
    val number = readln().toInt()
    val sb = StringBuilder()
    repeat(number) {
        sb.append(number)
    }
    print(sb.toString())
}