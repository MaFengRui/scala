package myscala.day01

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-24
  * Time:上午11:42
  * Vision:1.1
  **/
object TupleMatch {
  def main(args: Array[String]): Unit = {
    val tuple = (3, 4)
    val res = tuple match {
      case (0, _) => "0 and other"
      case (y, 0) => "other and 0"
      case _ => "no match"
    }
    println(res)
  }
}
