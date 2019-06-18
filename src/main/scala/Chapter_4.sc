import scala.collection.mutable

//6
val map = mutable.LinkedHashMap[String, Int]()
map += ("Monday" -> java.util.Calendar.MONDAY)
map += ("Tuesday" -> java.util.Calendar.TUESDAY)
map += ("Wednesday" -> java.util.Calendar.WEDNESDAY)
map += ("Thursday" -> java.util.Calendar.THURSDAY)
map += ("Friday" -> java.util.Calendar.FRIDAY)

for ((k, v) <- map) println(s"s: $k, v: $v")

//10
"Hello".zip("World")
