package encryptdecrypt

const val LOWER_CASE_MIN_VALUE = 97
const val UPPER_CASE_MIN_VALUE = 65

private const val ALPHABET_LENGTH = 25

abstract class AbstractAlgorithm : Algorithm {
    protected fun shiftByKey(c: Char, key: Int, operator: Char): Char = (c.code + addSign(key, operator)).toChar()

    protected fun shiftByKeyInField(c: Char, key: Int, operator: Char): Char {
        val minValue = if (c.isLowerCase()) LOWER_CASE_MIN_VALUE else UPPER_CASE_MIN_VALUE
        var newBase = c.code + addSign(key, operator) - minValue
        if (newBase < 0) newBase += ALPHABET_LENGTH + 1
        else if (newBase > ALPHABET_LENGTH) newBase --
        return (newBase % ALPHABET_LENGTH + minValue).toChar()
    }

    private fun addSign(key: Int, operator: Char): Int = when (operator) {
        '+' -> key
        '-' -> -key
        else -> 0
    }

    abstract override fun encrypt(plain: String, key: Int): String

    abstract override fun decrypt(encrypted: String, key: Int): String
}