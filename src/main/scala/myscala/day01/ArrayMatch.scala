package myscala.day01

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-24
  * Time:上午11:31
  * Vision:1.1
  **/
object ArrayMatch {
  def main(args: Array[String]): Unit = {

    val array = Array(0)
    val value = array match {
      case Array(0,0,3) => 0
      //匹配任何一个含有俩个元素的数组
      case Array(x, y) => s"$x,$y"
      //匹配第一元素是０的数组
      case Array(0, _*) => "0........"
      case _ => "no match"
    }
    println(value)

  }
}
