package myscala.day02

import scala.actors.Actor

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-25
  * Time:上午10:01
  * Vision:1.1
  **/
object  actor1 extends  Actor{
  def act():Unit = {
    for (i <- 1 to 10){
      println("acto1  ---" +i)
      Thread.sleep(1000)
    }
  }
}
object  actor2 extends  Actor{
  def act():Unit = {
    for (i <- 1 to 10){
      println("acto2  ---" +i)
      Thread.sleep(1000)
    }
  }
}
 object ActorDemo01 {
   def main(args: Array[String]): Unit = {
     actor1.start()
     actor2.start()
   }


}
