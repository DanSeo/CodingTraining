package ch2.anagram

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by daniel.seo on 2016. 8. 7..
  */
class AnagramTest extends FlatSpec with Matchers {
  "Same word" should "return true" in {
    val word1 = "note"
    val word2 = "note"
    Anagram.isAnagram(word1, word2) should be(true)
  }
  "Changing order word" should "return true" in {
    Anagram.isAnagram("note", "tnoe") should be(true)
  }

  "different length of word" should "return false" in {
    Anagram.isAnagram("test", "test2") should be(false)
  }
}
