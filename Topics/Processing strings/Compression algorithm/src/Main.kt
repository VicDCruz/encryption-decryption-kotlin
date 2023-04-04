fun main() {
    val dna = readln()
    var encrypt = ""
    var letter = ' '
    var count = 0
    for (s in dna) {
        if (s != letter) {
            if (count > 0) encrypt += "$letter$count"
            letter = s
            count = 1
        } else
            count++
    }
    if (letter != ' ') encrypt += "$letter$count"
    println(encrypt)
}