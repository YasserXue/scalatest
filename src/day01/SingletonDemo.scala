package day01

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Administrator on 2018/12/2 0002.
  * 单例对象演示
  */
object SingletonDemo {
  def main(args: Array[String]){
    val session = SessionFactory.getSession()
    print(session)
  }
}

object SessionFactory{
  var count = 5
  val sessions = ArrayBuffer[Session]()
  while(count > 0){
    val session = new Session
    sessions += session
    count -= 1
  }

  def getSession(): Session ={
    sessions.remove(0)
  }
}

class Session{

}
