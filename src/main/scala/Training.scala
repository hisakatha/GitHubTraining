import org.scalactic._
import TripleEquals._

package hisakatha {

  /**
    * Created by yusuke on 2017/01/26.
    */
  object Training {
    def main(args: Array[String]): Unit = {
      println("Hello, world!?")
      println(1 === 2 - 1)
      val funcs = new MyFuncs()
      println(funcs.adder2(2, 3))

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
  }

}