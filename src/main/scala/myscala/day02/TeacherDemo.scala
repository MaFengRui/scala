package myscala.day02

import scala.actors.Actor

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-25
  * Time:下午7:16
  * Vision:1.1
  *
  * //思路：定义一个教师角色的actor，处理学生发送的各种消息如请假、选课、问题等，
  * 练习发送同步消息，异步消息等。
  **/
object  test {

  def main(args: Array[String]): Unit = {
    val teacherDemo = new TeacherDemo
    teacherDemo.start()
    val unit: Any = teacherDemo!leave("请假")
//    println(unit)




  }
}
class TeacherDemo extends Actor{
  override def act(): Unit = {
   while (true){
     receive({
       case leave(string:String)=>{
         println(string)
//         sender ! "我已经处理完毕"
       }
       case  option(string:String) =>{
         sender ! "我已经处理完毕"
     }
       case question(string:String) =>{
     sender ! "我已经处理完毕"
   }
       case _ =>{
         sender ! "我已经处理完毕"
     }
     })

   }

  }

}
case class leave(string: String)
case class option(string: String)
case class question(string: String)
//case class other(string: String)

