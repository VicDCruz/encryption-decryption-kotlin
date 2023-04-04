package encryptdecrypt

import java.io.File

fun main(args: Array<String>) {
    val operation = getNamedArgument(args, "-mode", "enc")
    val plain = getNamedArgument(args, "-data", "")
    val inPath = getNamedArgument(args, "-in", "")
    val key = getNamedArgument(args, "-key", "0").toInt()
    val outPath = getNamedArgument(args, "-out", "")
    val algArg = getNamedArgument(args, "-alg", "shift")

    val inputData = if (plain === "" && inPath !== "") File(inPath).readText() else plain
    val algorithm = if (algArg === "unicode") UnicodeAlgorithm() else ShiftAlgorithm()
    val result = getResult(inputData, operation, key, algorithm)

    exportResult(outPath, result)
}

private fun getNamedArgument(args: Array<String>, name: String, default: String): String {
    val i = args.indexOf(name)
    if (i < 0) return default
    return args.getOrNull(i + 1) ?: default
}

private fun getResult(inputData: String, operation: String, key: Int, algorithm: Algorithm) =
    if (inputData === "") "Error" else {
        when (operation) {
            "enc" -> algorithm.encrypt(inputData, key)
            "dec" -> algorithm.decrypt(inputData, key)
            else -> ""
        }
    }


private fun exportResult(outPath: String, result: String) {
    if (outPath == "") println(result)
    else File(outPath).writeText(result)
}
