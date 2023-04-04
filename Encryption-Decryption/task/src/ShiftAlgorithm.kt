package encryptdecrypt

class ShiftAlgorithm : AbstractAlgorithm() {

    override fun encrypt(plain: String, key: Int): String {
        val cipher = StringBuilder()
        for (c in plain) cipher.append(toCipher(c, key))
        return cipher.toString()
    }

    private fun toCipher(c: Char, key: Int): Char = if (c.isLetter()) shiftByKeyInField(c, key, '+') else c

    override fun decrypt(encrypted: String, key: Int): String {
        val cipher = StringBuilder()
        for (c in encrypted) cipher.append(toDecipher(c, key))
        return cipher.toString()
    }

    private fun toDecipher(c: Char, key: Int): Char = if (c.isLetter()) shiftByKeyInField(c, key, '-') else c
}