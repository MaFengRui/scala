package day01

/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-24
  * Time:上午1:04
  * Vision:1.1
  **/
object insertSort {
  def isort(ints: List[Int]):List[Int] =
    if (ints.isEmpty) Nil
    else insert(ints.head,isort(ints.tail))
  def insert(i: Int, ints: List[Int]):List[Int] =
    if (ints.isEmpty || i <= ints.head) i :: ints
    else ints.head :: insert(i,ints.tail)

  def main(args: Array[String]): Unit = {
    val list1 = List(2,8,7,5,4,1)
    val list2 = isort(list1)
    println(list2)
  }
}








