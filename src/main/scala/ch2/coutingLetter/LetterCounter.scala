package ch2.coutingLetter

/**
  * Created by daniel.seo on 2016. 8. 5..
  */
object LetterCounter extends App {

  val letters = Letters(getLine)

  def getLine: String = io.StdIn.readLine()

  case class Letters(letters: String) {
    def length: Int = letters.length
  }

  if (letters.length == 0)
    println("Please put any character.")
  else
    println(s"${letters.letters} has ${letters.length} characters.")
}
