
/**
  *
  * Created with IDEA
  * author 光明顶斗士
  * Date:18-10-23
  * Time:下午9:41
  * Vision:1.1
  **/
object ListFilter extends App{
  def _find(list : List[Int])(block : List[Int] => List[Int]) : List[Int] = block(list)
  def find = _find(List(1,2,3,4,5,6,7,8,9))_
  private val list = find(xs => xs.filter(_ != 0).filter(_ % 2 == 0))
  private val list1 = find(xs => xs.filter(_ > 2))
  private val list2 = find(xs => xs.map(2 * _))
//  println(list)
//  println(list.foldLeft(-1)(_-_))
  private val ints = List(1,2,3,4)
  private val sorted: List[Int] = ints.sorted
  println(sorted)
   private val i: Int = sorted.foldRight(1)(_-_)
  println(i)


}