package myscala.day01

import scala.io.Source

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-24
  * Time:下午4:05
  * Vision:1.1
  **/
object FileDemo {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("/home/mafenrgui/Documents/Tencent Files/852067334/FileRecv/a.txt")
    //返回的是一个迭代器
    val lines: Iterator[String] = source.getLines()
    for (line <- lines)
      println(line)
    //读取内容保存在ARRAy　

  }


}
