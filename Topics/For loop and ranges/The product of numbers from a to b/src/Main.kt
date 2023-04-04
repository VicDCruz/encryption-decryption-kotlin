fun main() {
    var output: ULong = 1u
    for (i in readln().toULong() until readln().toULong())
        output *= i
    println(output)
}