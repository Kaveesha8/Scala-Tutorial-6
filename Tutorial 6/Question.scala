object Cipher extends App {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val Encryption = (char: Char, key: Int, alpha: String) =>
    alpha((alpha.indexOf(char.toUpper) + key) % alpha.size)

  val Decryption = (char: Char, key: Int, alpha: String) =>
    alpha((alpha.indexOf(char.toUpper) - key) % alpha.size)

  val cipher =
    (algo: (Char, Int, String) => Char, s: String, key: Int, a: String) =>
      s.map(algo(_, key, a))

  val encrypted = cipher(Encryption, "School", 5, alphabet)
  val decrypted = cipher(Decryption, encrypted, 5, alphabet)

  println(encrypted)
  println(decrypted)

  val encrypted2 = cipher(Encryption, "Home", 10, alphabet)
  val decrypted2 = cipher(Decryption, encrypted2, 10, alphabet)

  println(encrypted2)
  println(decrypted2)
}
