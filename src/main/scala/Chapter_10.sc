import java.awt.Point

trait Logger {
  def log(msg: String)
}

trait ConsoleLogger extends Logger {
  override def log(msg: String) {
    println(msg)
  }
}

abstract class Service extends Logger

object MyService extends Service with ConsoleLogger

MyService.log("something")


trait OverrideLogger extends Logger {
  abstract override def log(msg: String): Unit = {
    super.log(msg)
  }
}


object MyService2 extends Service with ConsoleLogger with OverrideLogger

MyService2.log("else")

trait ShortLogger extends Logger {
  val maxLength = 10
}

trait AnotherShortLogger extends Logger {
  val maxLength = 15
}

object MyService3 extends Service with ConsoleLogger with AnotherShortLogger with ShortLogger {
  override val maxLength = super[AnotherShortLogger].maxLength
}

MyService3.maxLength

trait LoggedException extends ConsoleLogger {
  this: Exception =>
  def log() {
    log(getMessage())
  }

}


//1
class OrderedPoint extends Point with Ordered[Point] {
  override def compare(that: Point): Int = {
    if (x < that.x) -1
    else if (x == that.x) {
      if (y < that.y) -1
      else 0
    }
    else 1
  }
}
