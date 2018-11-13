//package myscala.day01
//
///**
//  *
//  * Created with IDEA
//  * author 光明顶斗士
//  * Date:18-10-24
//  * Time:下午2:30
//  * Vision:1.1
//  **/
////样例类的模式匹配
//
//abstract  class  Notification
//case class Email(sender:String,title:String)extends Notification
//case class SMS(caller:String,message:String) extends Notification
//case  class VoiceRecording(contactName:String,link:String)extends Notification
//
//object CaseClassDemo2 {
//  def showNotification(notification:Notification)={
//    case Email(sender,title)=> s"$sender+'---------'+$title"
//    case SMS(caller,message) => s"you get an $message from $caller"
//    case VoiceRecording(name,link) => s"you get info from $name"
//    case _=>println("other message")
//
//  }
//
//  def main(args: Array[String]): Unit = {
//    val  email = Email("kate","email info")
//    println(showNotification(email))
//  }
//}
