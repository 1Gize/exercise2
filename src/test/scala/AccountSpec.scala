import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class AccountSpec extends AnyFlatSpec with should.Matchers{

  "function deposit" should "add specified amount to account balance" in{
    val acc =  Account(1,5000)
    acc.deposit(500) shouldBe 5500
  }
  "function withdraw" should "subtract specified amount from balance" in{
    val acc =  Account(1,5000)
    acc.withdraw(500) shouldBe 4500
  }
  it should "dont change balance if amount is greater then account balance" in{
    val acc =  Account(1,5000)
    acc.withdraw(5001) shouldBe 5000
  }
  "function printStatement" should "print account info" in{
    val acc =  Account(1,5000)
    acc.printStatement() shouldBe "id: 1, balance: 5000"
  }
}
