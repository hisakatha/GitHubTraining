import org.scalactic._
import TripleEquals._

package hisakatha {

  /**
    * Created by yusuke on 2017/01/26.
    */
  object Training {
    def main(args: Array[String]): Unit = {
      // A case class for option parser.
      case class Config(multiply: Boolean = false, seq: Seq[Int] = Seq())
      val parser = new scopt.OptionParser[Config]("calc") {
        head("calc", "1.0")
        opt[Unit]('m', "multiply").optional().action((_, c) => c.copy(multiply = true)).text("Return a product instead of a sum.")
        arg[Int]("<integer>...").unbounded().required().action((x, c) => c.copy(seq = c.seq :+ x)).text("Integers to be calculated.")
        help("help").text("Print this help text")
        version("version")
        note("Return the number calculated from integers of the command line argument. In default, integers are added.")
      }

      assert(1 === 2 - 1)

      val funcs = new MyFuncs()
      val parsed: Config = parser.parse(args, Config()) match {
        case Some(config) => config
        case None => sys.error("ERROR: Bad arguments.")
      }

      println(funcs.adder(parsed.seq))

    }
  }

  /**
    * Class for various mathematical functions.
    */
  class MyFuncs {
    /**
      * Return a sum of two integers.
      * @param a Integer to be added.
      * @param b Integer to be added.
      * @return Sum of a and b.
      */
    def adder2(a: Int, b: Int): Int = {
      a + b
    }

    /**
      * Return a sum of integers in list.
      * @param list Integers to be added.
      * @return Sum of integers in list.
      */
    def adder(list: Seq[Int]): Int = {
      list.foldLeft(0)((e1, e2) => adder2(e1, e2))
    }

    /**
      * Return a product of two integers.
      * @param a Integer to be multiplied.
      * @param b Integer to be multiplied.
      * @return Product of a and b.
      */
    def multiplier2(a: Int, b:Int): Int ={
      a * b
    }

    /**
      * Return a product of integers in list.
      * @param list Integers to be multiplied.
      * @return Product of integers in list.
      */
    def multiplier(list: Seq[Int]): Int ={
      list.foldLeft(1)((e1, e2) => multiplier2(e1, e2))
    }
  }

}