fun main() {
    val times = readln().toInt()
    var positives = 0
    repeat(times) {
        if (readln().toInt() > 0) positives++
    }
    println(positives)
}