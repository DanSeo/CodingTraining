package ch2.greeting

/**
  * Created by daniel.seo on 2016. 8. 5..
  */
object GreetingMain extends App {

  def sayHello(name: String): Unit =
    println(s"Hello, $name, nice to meet you!")

  def getLine: String =
    scala.io.StdIn.readLine()

  println("What is your name? ")
  sayHello(getLine)
}
