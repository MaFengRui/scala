package myscala.day01

import scala.util.Random

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-24
  * Time:上午11:13
  * Vision:1.1
  **/
object MatchObject {
  def main(args: Array[String]): Unit = {
    val arr = Array("scala",1,2,0,'a')
    val obj = arr(Random.nextInt(arr.length))
    println(obj)

    obj match {
      case x:Int => println("Int " + x)
      case s:String => println(s.toString)
      case _:Double => println(Int.MaxValue)
      case _ => println("no BB")
        //匹配的类型带泛型信息，不能写具体类型
        //特殊情况。数组可以带详细的类型和信息
      case m:Map[_,_] => println("")
      case m:Array[Int] => println("ArrayMactch")

    }
  }

}
