package A {

  class X {}

  object B {
    val abc = 2
    def call(): Unit ={

    }
  }

  package B {

    object Reverse extends App {
      new X
      println(args.reverse.mkString(" "))
      B.abc
      B.call
    }

  }

}
