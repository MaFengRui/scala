package myscala.day01

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-22
  * Time:下午6:53
  * Vision:1.1
  **/
object day01 {
  def main(args: Array[String]): Unit = {
    //1、写一个for循环
//    for (i <- 0 to 10 reverse) println(i)
    //２、写一个for循环急速那字符串中的所有字母的unicode代码的乘积
    var t:Long = 1
    for(i <- "Hello") {
      t = t * i.toLong
    }
//    println(t)
    //3 编写一个函数product1(s.String) 计算练习２提到的乘积
//    println(prodeuct1("Hello"))


    //4 编写一个循环，将整数数组中相邻的元素置换，如Array(1,2,3,4,5)经过置换变为Array(2,1,4,3,5)
    val arr = Array(1,2,3,4,5,6)
    for (i <- 0 until arr.length ){

      if (arr.length == 1){
        return  arr
      }else{

        if ((i+1)%2 == 0 & (i >0)){
          val temp = arr(i-1)
          arr(i-1) = arr(i)
          arr(i) = temp
        }else{
          arr
        }
      }

    }
    for(i  <- arr){
      print(i)
    }
    print(count("I love china"))
    }

  def prodeuct1 (s:String):Long={

    //这是第一种方法
//    if (s.length==0){
//      return 0
//    }
//
//    var t:Long = 1
//    for(i <- s){
//    t = t * i.toLong
//  }
//  return t
    //第二种方法 用递归的方法
    if(s.length==1){
      return  s.charAt(0).toLong
    }else
      {
        s.take(1).charAt(0).toLong*prodeuct1(s.drop(1))
      }

  }
  //实现单词的统计
  def count(conten:String):Map[String,Int] = {
    val count = scala.collection.mutable.Map[String,Int]()
    for (word <- conten.split(" ")){
      if (count.contains(word)){
        count(word) = count(word)+1
      }else
        count += (word -> 1)

    }
    count.toMap
  }

}
