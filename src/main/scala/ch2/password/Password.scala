package ch2.password

import ch2.password.SecurityLevel.SecurityLevel

/**
  * Created by daniel.seo on 2016. 8. 7..
  */
object SecurityLevel extends Enumeration {
  type SecurityLevel = Value
  val VeryStrong = Value("VeryStrong")
  val Strong = Value("Strong")
  val Weak = Value("Weak")
  val VeryWeak = Value("VeryWeak")
  val Normal = Value("Normal")
  val Invalid = Value("Invalid")
}

class Password(password: String) {
  def level(): SecurityLevel = {
    if (password.isEmpty)
      SecurityLevel.Invalid
    else if (password.matches("[0-9]{1,7}"))
      SecurityLevel.VeryWeak
    else if (password.matches("[a-zA-Z]{1,7}"))
      SecurityLevel.Weak
    else if (password.matches("(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[^\t\r\n\fa-zA-Z0-9]).{8,}"))
      SecurityLevel.VeryStrong
    else if (password.matches("(?=.*[0-9])(?=.*[a-zA-Z]).{8,}"))
      SecurityLevel.Strong
    else
      SecurityLevel.Normal
  }
}
