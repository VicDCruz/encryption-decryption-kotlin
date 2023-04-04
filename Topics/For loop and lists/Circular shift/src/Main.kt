fun main() {
    val times = readln().toInt()
    val integers = MutableList(times) { readln().toInt() }
    integers.add(0, integers.removeAt(integers.lastIndex))
    println(integers.joinToString(" "))
}