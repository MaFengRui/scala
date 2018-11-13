package myscala.day01.DayTest

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-24
  * Time:下午7:50
  * Vision:1.1
  **/
object functionTest extends App{
  def test(fun: (Int) => Int, Low: Int, High: Int) :List[(Int,Int)] ={
    //先考虑他的返回值
    var arr = List[(Int, Int)]()
    Low to High foreach {
      num => arr =  (num, fun(num))::arr
        println(num)
    }
    arr
  }
  println(test(x => x*x,-5,5))
  val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
  println(nums)

}


