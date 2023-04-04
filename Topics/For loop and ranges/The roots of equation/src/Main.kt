import kotlin.math.pow

fun main() {
    val coefficients = MutableList(4) { readln().toInt() }
    for (x in 0..1_000)
        if (isRoot(x, coefficients)) println(x)
}

fun isRoot(x: Int, coefficients: MutableList<Int>): Boolean {
    var sum = 0.0
    for (i in 0 until coefficients.size)
        sum += coefficients[i] * x.toDouble().pow(3 - i)
    return sum == 0.0
}
