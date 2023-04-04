package encryptdecrypt

class UnicodeAlgorithm : AbstractAlgorithm() {
    override fun encrypt(plain: String, key: Int): String {
        val cipher = StringBuilder()
        for (c in plain) cipher.append(toCipher(c, key))
        return cipher.toString()
    }

    private fun toCipher(c: Char, shift: Int): Char = shiftByKey(c, shift, '+')

    override fun decrypt(encrypted: String, key: Int): String {
        val cipher = StringBuilder()
        for (c in encrypted) cipher.append(toDecipher(c, key))
        return cipher.toString()
    }

    private fun toDecipher(c: Char, shift: Int): Char = shiftByKey(c, shift, '-')
}