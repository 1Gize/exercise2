import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class BankSpec extends AnyFlatSpec with should.Matchers{
  val bank = Bank("PKO")
  bank.addAcc(Account(1,5000))
  "function addAcc" should "add new account to list" in{

    bank.accs.length shouldBe 1
  }
  "function closeAcc" should "change acc balance to 0 "in{
    bank.closeAcc(Account(1,5000))
    bank.accs(0).accBalance shouldBe 0
  }
}
