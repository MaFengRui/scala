package myscala.day01

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-24
  * Time:下午2:56
  * Vision:1.1
  **/
object PartialFunDemo {
  //定义偏函数，其实是创建了PartialFunction 的有一个实例
def fun:PartialFunction[String,Int]={
    case "one" => 1
    case "two" =>2
    case _=>0
  }

  def main(args: Array[String]): Unit = {
    println(fun.isDefinedAt("three"))
    println(fun.apply("one"))
    println(fun("one")) //调用的时fun.apply("one")
  }
}
