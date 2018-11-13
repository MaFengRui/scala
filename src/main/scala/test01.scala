/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-22
  * Time:下午12:10
  *
  *
  * Vision:1.1
  **/
object test01 {

  def main(args: Array[String]): Unit = {
    val s = List(2,3,4,5)
    s.foldRight(1)(_-_)

    print( 1)
    print(s)
  }

}
