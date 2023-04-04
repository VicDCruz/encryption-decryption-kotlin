fun main() {
    val resp = readln().toInt()
    println(when(resp) {
        2 -> "Yes!"
        1, 3, 4 -> "No!"
        else -> "Unknown number"
    })
}