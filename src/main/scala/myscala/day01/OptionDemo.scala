package myscala.day01

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-24
  * Time:下午2:43
  * Vision:1.1
  **/
class OptionDemo {
  def main(args: Array[String]): Unit = {
    val map = Map("a"->2,"b"->2)
    val value = map.get("a") match {
      case  Some(elem) => elem
      case None => 0
    }
    println(map.get("a"))
    println(value)
    val value2 = map.getOrElse("a",0)
    println(value2)
  }

}
