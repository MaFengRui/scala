package myscala.day01.DayTest

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-24
  * Time:下午7:41
  * Vision:1.1
  * 1、利用用模式匹配,对List做出如下匹配条件 (1)不管元素个数,List是否以1开头
(2)List含有三个元素,并且第二个元素是2 (3)List含有两个元素,并且最后一个元素是3 (4)都不符合以上
条件
  **/
object ListPattrn {

  def m(l:List[Int]) {
      l match {
        case (List(1,_*)) =>println("begin with 1")
        case (List(_,2,_)) => println("total 3")
        case (List(_,3)) => println("last 3")
        case _ => println("no thing")
      }

  }

  def main(args: Array[String]): Unit = {

  }

}
