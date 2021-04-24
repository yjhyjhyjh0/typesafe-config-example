package etl

import com.typesafe.config.ConfigFactory

class Main {

}

object Main {
  def main(args: Array[String]): Unit = {


    println("hello")

    val env = "dev"
//    val config = ConfigFactory.load(s"application-${env}.conf")
    val config = ConfigFactory.load()
    val foo1 = config.getConfig("foo.kafka").getString("foo1")
    val foo2 = config.getConfig("foo.kafka").getInt("foo2")
    println(s"foo1 :$foo1")
    println(s"foo2 :$foo2")


    val ref1 = config.getConfig("ref").getString("ref1")
    val ref2 = config.getConfig("ref").getInt("ref2")
    println(s"ref1 :$ref1")
    println(s"ref2 :$ref2")

    val app1 = config.getConfig("app").getString("app1")
    val app2 = config.getConfig("app").getInt("app2")
    println(s"app1 :$app1")
    println(s"app2 :$app2")
  }
}