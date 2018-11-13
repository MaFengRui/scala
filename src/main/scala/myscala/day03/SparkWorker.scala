//package myscala.day03
//
//import java.util.UUID
//
//import akka.actor.{Actor, ActorSelection, ActorSystem, Props}
//import com.typesafe.config.ConfigFactory
//
//import scala.concurrent.duration.DurationDouble
//
///**
//  *
//  * Created with IDEA
//  * author 光明顶斗士
//  * Date:18-10-26
//  * Time:上午10:10
//  * Vision:1.1
//  **/
//class  SparkWorker(masterurl:String) extends  Actor{
//  //需要master的actorRef
//  var masterProxy: ActorSelection = _
//  var  workerId = UUID.randomUUID().toString
//
//  override def preStart(): Unit ={
//    masterProxy = context.actorSelection(masterurl)
//  }
//  override def receive: Receive = {
//    case "started" => {
//        //向master注册我要已经启动
//      masterProxy ! RegisterWorkerInfo(workerId,8,16*1024)
//
//    }
//      //启动一个定时器，周期性master发送心跳
//    case RegisterWorkerInfo=>{
//      import  context.dispatcher
//      context.system.scheduler.schedule(0 milli()lis,2000 millis,self,SendHeartbeat)
//    }
//    case SendHeartbeat => {
//      //开始向master发送心跳
//      masterProxy ! HeartBeat
//    }
//  }
//}
//object SparkWorker {
//  def main(args: Array[String]): Unit = {
//    if (args.length != 4){
//      println("请输入参数:<host><port><workname><masterURL>".stripMargin)
//      sys.exit()
//    }
//    val host = args(0)
//    val port = args(1)
//    val WorkerName = args(2)
//    val masterURL = args(3)
//
//    val config = ConfigFactory.parseString(
//      s"""
//         |akka.actor.provider="akka.remote.RemoteActorRefProvider"
//         |akka.remote.netty.tcp.hostport=$host
//         |akka.remote.netty.tcp.port=$port
//       """.stripMargin)
//
//    val actorSystem = ActorSystem("sparkworker",config)
//
//    //创建actor Ref
//    val workerActorRef = actorSystem.actorOf(Props( new SparkWorker(masterURL)),WorkerName)
//    //开始向sparkworker发送消息
//    workerActorRef ! "started"
//
//  }
//
//
//
//
//}
