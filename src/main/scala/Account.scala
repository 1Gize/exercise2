case class Account (id: Long, balance:Long){
  val accId = id
  var accBalance = balance
  def deposit(amount: Long): Long={
    accBalance += amount
    accBalance
  }
  def withdraw(amount: Long): Long={
    if(accBalance >= amount){
      accBalance = accBalance - amount
      accBalance
    }else{
      println("Insufficient balance!")
      accBalance
    }
  }
  def printStatement(): String={
    println(s"id: $id, balance: $balance")
    s"id: $id, balance: $balance"
  }
  def closeAcc(): Unit ={
    accBalance = 0
  }
}
