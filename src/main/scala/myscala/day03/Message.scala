//package myscala.day03
////worker向master注册想信息
//case  class RegisterWorkerInfo(id:String,core:Int,ram:Int)
////注册成功的信息
//case object RegisteredworkerInfo
////worker 向master发送心跳
//case class HeartBeat(id:String)
////worker定时发送器,自己发给自己
//case object SendHeartbeat
////master－>master检查worker有没有检查超时
//case  object CheckTimeOutWorker
////master->master删除超时的worker
//case  object  RemoveTimeWorker
//
//class  WorkerInfo(id:String,core:Int,ram:Int){
//  var lastHearbeatTimr:Long =._
//
//}
//
///**
//  *
//  * Created with IDEA
//  * author 光明顶斗士
//  * Date:18-10-26
//  * Time:上午10:10
//  * Vision:1.1
//  **/
//object Message {
//
//}
