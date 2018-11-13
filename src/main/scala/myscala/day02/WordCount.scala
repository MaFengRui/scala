package myscala.day02

import java.util

import scala.actors.{Actor, Future}
import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}
import scala.io.Source

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-25
  * Time:上午11:17
  * Vision:1.1
  **/
//使用actor同式处理多个文件　最后对结果汇总
object WordCount {
  def main(args: Array[String]): Unit = {

//      val futuresToFutures = mutable.HashSet[Future[Any]]
//      ListBuffer[]

    val  replys = new ListBuffer[Future[Any]]
    val files = Array("","","")

    for (file <- files){

      val task = new Task

      task.start()
      val value= task !! submitTask(file)
          replys += value
    }

    val respond = new ArrayBuffer[Map[String,Int]]()
    while (replys.size >0){
      val listBuffer: ListBuffer[Future[Any]] = replys.filter(_.isSet)
      for (res <- listBuffer){
        val map: Map[String, Int] = res.apply().asInstanceOf[Map[String,Int]]
        respond += map
        replys -= res
      }
      val stringToInt = respond.flatten.groupBy(_._1).mapValues(_.foldLeft(0)(_+_._2))
      println(stringToInt)

    }
  }
}
class  Task extends  Actor{

  override def act(): Unit = {
    while (true){
      receive({
        case  submitTask(file) =>{
          val lines = Source.fromFile(file).getLines()
          val listlines = lines.toList
          val list = listlines.flatMap(_.split(" "))
          val tuples = list.map((_,1))
          val map = tuples.groupBy(_._1)
          val map1: Map[String, Int] = map.mapValues(_.size)
          sender!map1
        }
      })
    }
  }

}
case  class submitTask(filename:String)
case  class ResultTask(result:Map[String,Int])

//case class ResultTask(map1: Map[String, Int])