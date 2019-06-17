import java.time.LocalDate

def sign(i: Double): Int = {
  if (i > 0) return 1
  if (i < 0) return -1
  0
}

sign(100)
sign(-20)
sign(0.0)

val a: Unit = {}

var y: Int = 0
val x: Unit = y = 1

for (i <- 10 to 0 by -1) {
  System.out.println(i)
}

def countdown(n: Int): Unit = {
  for (i <- n to 0 by -1) {
    System.out.println(i)
  }
}

countdown(10)

var multiple: Long = 1L
for (c: Char <- "Hello") multiple *= c.toInt
System.out.println(multiple)


multiple = 1
"Hello".foreach(c => multiple *= c)
System.out.println(multiple)

"Hello".foldLeft(1L)(_ * _)

def product(s: String): Long = {
  s.foldLeft(1L)(_ * _)
}

System.out.println(product("yes"))

def productRecursive(s: String): Long = {
  if (s.length == 0) return 1L
  productRecursive(s.drop(1)) * s.head
}

productRecursive("Hello")

def pow(x: Double, n: Int): Double = {
  if (n > 0) {
    if (n % 2 == 0) Math.pow(Math.pow(x, n / 2), 2)
    else x * Math.pow(x, n - 1)
  } else if (n < 0) 1 / Math.pow(x, -n)
  else 1
}

pow(2, 6)
pow(2, 5)
pow(2, -3)

implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
  def date(args: Any*): LocalDate = {
    for (part <- sc.parts) if (!"-".equals(part)) throw new RuntimeException
    if (args.length != 3) throw new RuntimeException
    val a = args.filter(_.isInstanceOf[Int]).map(_.toString.toInt)
    if (a.length != 3) throw new RuntimeException
    LocalDate.of(a(0), a(1), a(2))
  }
}

val year = 2019
val month = 11
val day = 9
date"$year-$month-$day"

