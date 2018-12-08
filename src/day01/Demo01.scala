package day01

/**
  * Created by Administrator on 2018/12/2 0002.
  * 主构造器与辅助构造器
  */
class Dog {

  var name: String = "123"

  def this(name: String){
    //辅助构造器必须以主构造器开始
    this()
    this.name = name
//    print(name)
  }

}

object Dog{
  def main(args: Array[String]): Unit ={
    val dog1 = new Dog()
    println(dog1.name)
    val dog2 = new Dog("eba")
    println(dog2.name)
  }
}