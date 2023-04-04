fun main() {
    val totalCompanies = readln().toInt()
    val income = MutableList(totalCompanies) { readln().toInt() }
    val taxRate = MutableList(totalCompanies) { readln().toInt() }
    val taxes = mutableListOf<Double>()
    for (i in income.indices)
        taxes.add(income[i] * taxRate[i] / 100.0)
    println(taxes.indexOf(taxes.maxOrNull()) + 1)
}