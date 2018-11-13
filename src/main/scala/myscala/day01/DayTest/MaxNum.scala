package myscala.day01.DayTest

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-25
  * Time:上午12:20
  * Vision:1.1
  **/
object MaxNum extends  App{
  def lagrest(fun:(Int) => Int ,Input:Seq[Int])={
    val  s = Input.reduceLeft((a,b)=> if (fun(a) > fun(b)) a else  b)
    fun(s)
  }

  private val i: Int = lagrest(x => x * 2 + x, 1 to 10)
  println(i)

}
