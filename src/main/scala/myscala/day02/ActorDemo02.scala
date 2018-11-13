package myscala.day02

import scala.actors.Actor

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-25
  * Time:上午10:11
  * Vision:1.1
  **/

class  actor3 extends  Actor{
  override def act(): Unit = {
    while (true){
      receive{ //匿名偏函数
        case  "start"=>{
          println("start")
          Thread.sleep(1000)
          println("started")
        }
        case  "stop" =>{
          println("sleeping")
          Thread.sleep(2000)
          println("stop")
        }
      }

    }
  }
}
object ActorDemo02 {
  def main(args: Array[String]): Unit = {
     val actor1 = new  actor3()
    actor1.start()
    actor1!"start"
    actor1!"stop"
    println("消息完成")
  }


}
