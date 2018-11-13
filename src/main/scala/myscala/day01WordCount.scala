package myscala

import scala.io.Source

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-23
  * Time:下午12:53
  * Vision:1.1
  **/
object day01WordCount {
  def main(args: Array[String]): Unit = {
    val lines = Source.fromFile("").getLines().toList

//    val lines = List("spark scala hadoop ooize java s", "spark hadoop ooize java", "scala hadoop ooize java  ")
    val strings: List[String] = lines.flatMap(_.split(" "))
    val strings1: List[String] = strings.filter(_ != " ")
    val tuples: List[(String, Int)] = strings1.map((_, 1))
    val stringToTuples: Map[String, List[(String, Int)]] = tuples.groupBy(_._1)
    val stringToInt: Map[String, Int] = stringToTuples.mapValues(_.size)
    val tuples1: List[(String, Int)] = stringToInt.toList.sortWith(_._2 > _._2)
    println(tuples1)
//    val list: List[(String, Int)] = lines.flatMap(_.split(" ")).filter(_ != " ").map((_, 1)).groupBy(_._1).mapValues(_.size).toList.sortWith(_._2 > _._2)
//    print(list);
    val l1 = List(1,2,3)
    val l2 = List("a","b","c")
    val list = l1.zip(l2)
    println(list)
  }
}


