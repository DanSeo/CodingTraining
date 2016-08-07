package ch2.anagram

/**
  * Created by daniel.seo on 2016. 8. 7..
  */

object Anagram extends App {
  def isAnagram(word1: String, word2: String): Boolean = {
    if (word1.length != word2.length)
      return false
    var wordToBit: Int = 0
    word1.foreach { c: Char =>
      wordToBit |= (1 << c)
    }

    word2.foldLeft(true) { (acc, ch) =>
      acc && ((wordToBit & (1 << ch)) == (1 << ch))
    }
  }

}
