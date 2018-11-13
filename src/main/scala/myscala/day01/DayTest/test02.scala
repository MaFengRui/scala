package myscala.day01.DayTest

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-26
  * Time:下午2:41
  * Vision:1.1
  **/
object test02 {
  def main(args: Array[String]): Unit = {
    val map:Map[String,Int] =Map(("a",1),("b",2))
    val map1 = map.mapValues(_*2)
    println(map1)
//val t1:List(String = List("a","c")
    def fun(name:String,age:Int = 15) {}
    println(fun("sdfd"))
  }

}
