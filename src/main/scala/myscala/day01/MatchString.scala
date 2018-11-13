package myscala.day01

import scala.util.Random

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-24
  * Time:上午11:27
  * Vision:1.1
  **/
object MatchString {
  def main(args: Array[String]): Unit = {
    val arr = Array("zhangsan","lisi","wangmazi")
    val name = arr(Random.nextInt(arr.length))
    println(name)
    name match {
      case  "zhangsan" => println("you get"+name)
      case _=> println("no Match")
    }
  }

}
