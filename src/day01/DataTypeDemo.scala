package day01

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.Source

/**
  * Created by Administrator on 2018/12/3 0003.
  */
object DataTypeDemo {
  def main(args: Array[String]): Unit ={
//    val hashSet = new mutable.HashSet[mutable.Map[Any]]
//    val hashSet2 = new mutable.HashSet[Int]
//    val map = mutable.Map("a" -> 1)1
//    hashSet2 += 1
//    println(hashSet2)

//    val line = Source.fromFile("F://wc//input//InstallConfig.ini").mkString
//    println(line)
//    println("---")
//    val lines = line.split("\r\n")
//    for(st <- lines){
//      println(st)
//      println("---")
//    }

    val list = ListBuffer[Map[String,Int]](Map("peopl" -> 1,"Install]" -> 1), Map("interesting" -> 1,"peopl" -> 1, "people" -> 1))
    println(list)
    val result = list.flatten.groupBy(_._1).mapValues(_.foldLeft(0)(_ + _._2))
    println(result)
  }
}
