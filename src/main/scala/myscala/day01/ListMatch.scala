package myscala.day01

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-24
  * Time:上午11:37
  * Vision:1.1
  **/
object ListMatch {
  def main(args: Array[String]): Unit = {
    val  list = List(1,2)
    list match {
        //包含元素０
      case 0 :: Nil => "0"
        //包含两个元素的
      case x::y::Nil => x+"::"+y
        //包含以０开头的列表
      case 0::tail =>"0*******"
    }
  }

}
