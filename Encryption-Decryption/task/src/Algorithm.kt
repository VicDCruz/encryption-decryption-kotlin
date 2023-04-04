package encryptdecrypt

interface Algorithm {
    fun encrypt(plain: String, key: Int): String
    fun decrypt(encrypted: String, key: Int): String
}