package ch2.password

import org.scalatest._

/**
  * Created by daniel.seo on 2016. 8. 7..
  */
class PasswordTest extends FlatSpec with Matchers {
  "Password typed empty string" should "return invalid password " in {
    new Password("").level() should be(SecurityLevel.Invalid)
  }
  "Password typed less than 8 numbers" should "return very weak password " in {
    new Password("12345").level() should be(SecurityLevel.VeryWeak)
    new Password("123456").level() should be(SecurityLevel.VeryWeak)
    new Password("1234567").level() should be(SecurityLevel.VeryWeak)
  }
  "Password typed less than 8 alphabets" should "return weak password " in {
    new Password("abcde").level() should be(SecurityLevel.Weak)
    new Password("abcdef").level() should be(SecurityLevel.Weak)
    new Password("abcdefg").level() should be(SecurityLevel.Weak)
    new Password("Abcdefg").level() should be(SecurityLevel.Weak)
  }
  "Password typed more than 8 alphabets and numbers" should "return strong password " in {
    new Password("abc123defg").level() should be(SecurityLevel.Strong)
    new Password("abc1d3e2fg").level() should be(SecurityLevel.Strong)
    new Password("abac1d3e2fg").level() should be(SecurityLevel.Strong)
  }
  "Password typed more than 8 alphabets, numbers, and special chatacters" should "return very strong password " in {
    new Password("abc123d%%!!efg").level() should be(SecurityLevel.VeryStrong)
    new Password("abc1d@#*3e2fg").level() should be(SecurityLevel.VeryStrong)
    new Password("abac1d3e2@!fg").level() should be(SecurityLevel.VeryStrong)
  }

}
