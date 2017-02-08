import org.scalatest._

/**
  * Created by yusuke on 2017/01/26.
  */
class MyFuncsTest extends FlatSpec with Matchers {

  val funcs = new hisakatha.MyFuncs
  "adder2" should "return the sum of two integers" in {
    funcs.adder2(0, 0) shouldBe 0
    funcs.adder2(1, 2) shouldBe 3
    funcs.adder2(-100, 50) shouldBe -50
  }

  "adder" should "return the sum of integer list (4 elements)" in {
    funcs.adder(Seq(0, 1, 2, 3)) shouldBe 6
  }

  "adder" should "return the sum of integer list (a single element)" in {
    funcs.adder(Seq(2)) shouldBe 2
  }

  "multiplier2" should "return the product of two integers" in {
    funcs.multiplier2(0, 5) shouldBe 0
    funcs.multiplier2(6, 9) shouldBe 54
    funcs.multiplier2(7, -8) shouldBe -56
  }

  "multiplier" should "return the product of integer list" in {
    funcs.multiplier(Seq(4, -2, 3, 1, 5)) shouldBe -120
  }

}
