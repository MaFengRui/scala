package myscala.day01.DayTest

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-24
  * Time:下午9:06
  * Vision:1.1
  **/
object TestLeft extends  App{
  val arr =  Array(1,2,3,5,7,10)

  println(arr.reduceLeft((a,b) => if (a > b) a else b))

  println(1 to 10 reduceLeft(_*_))

}
