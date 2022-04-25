import scala.collection.mutable.ListBuffer

case class Bank(s: String){
  val name = s
  val accs = ListBuffer[Account]()
  def addAcc(acc: Account): Unit ={
    accs += acc
  }
  def closeAcc(acc: Account) ={
    accs.find(a => a.id == acc.id).get.accBalance = 0
  }
}
