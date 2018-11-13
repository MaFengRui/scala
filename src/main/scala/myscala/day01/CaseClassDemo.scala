package myscala.day01

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-24
  * Time:下午2:19
  * Vision:1.1
  **/
//样例类是一个特殊的类，有自动生成一个apply方法,提供unapply，可以模式匹配这个类的属性
//构造器中的参数如果不显示指定，默认val类型
case class  Point(x:Int,y:Int){

}
object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    val point = Point(1,2) //没有new
    val point2 = Point(2,2)
    val point3 = Point(2,2)
    //比较样例类
    if(point3 == point2){
      println("same")
    }else{
      println("different")
    }
    //默认属性都是val方法
  }
}
