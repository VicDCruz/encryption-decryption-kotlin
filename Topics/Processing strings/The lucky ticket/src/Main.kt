fun main() {
    val ticket = readln()
    var type = 0
    for (i in 0..ticket.lastIndex / 2)
        type += Character.getNumericValue(ticket[i]) - Character.getNumericValue(ticket[ticket.lastIndex - i])
    println(if (type == 0) "Lucky" else "Regular")
}