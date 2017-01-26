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

  "adder" should "return the sum of integer list" in {
    funcs.adder(Seq(0, 1, 2, 3)) shouldBe 6
  }

}
