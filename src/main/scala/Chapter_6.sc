

//1
object Conversions {

  var a: Int = 2

  def inchesToCentimeters(): Unit = {
    a += 1
  }

  def gallonsToLiters() {}

  def milesToKilometers() {}
}


Conversions.getClass

//2
class UnitConversion {}

object InchesToCentimeters extends UnitConversion

object GallonsToLiters extends UnitConversion

object MilesToKilometers extends UnitConversion

//3
object Origin extends java.awt.Point // could operate point only

//4
class Point(val x: Double, val y: Double) {
}

object Point {
  def apply(x: Double, y: Double): Point =
    new Point(x, y)

  def x(): Unit = {

  }
}

Point.getClass

val point1 = new Point(3, 4)
val point2 = Point(4, 5)
point1.x
point2.y

class Check() {
  def check(x: Int, y: Int) = {
    x > y
  }
}

object Check extends Check {
  def apply(x: Int, y: Int): Boolean = {
    check(x, y)
  }
}

println(Check(1, 2))
