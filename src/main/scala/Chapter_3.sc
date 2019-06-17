import java.util.TimeZone

import scala.collection.mutable
import scala.util.Random

//1
val n = 9
val a = new Array[Int](n)
for (i <- a.indices) {
  a(i) = Random.between(0, n)
}
a

for (_ <- 0 until n) yield Random.between(0, n)

//2
def switch(a: Array[Int]): Unit = {
  for (i <- 1 until n by 2) {
    val t = a(i)
    a(i) = a(i - 1)
    a(i - 1) = t
  }
}
switch(a)
a

//3
for (i <- a.indices) yield {
  if (i % 2 == 1) a(i - 1)
  else if (i == a.length - 1) a(i)
  else a(i + 1)
}

//4
val b = for (_ <- 0 until n) yield Random.nextInt()
val (_1, _2) = b.partition(_ > 0)
_1.concat(_2)

//5
val d = for (_ <- 0 until n) yield Random.nextDouble
d.sum / d.length

//6
a.reverse
a.toBuffer.reverse

//7
val x = Array(1, 1, 2, 3, 4, 5, 6)
x.distinct

//10
TimeZone.getAvailableIDs
  .filter(_.startsWith("America/"))
  .map(_.replace("America/", ""))

//11
import java.awt.datatransfer._

import scala.jdk.CollectionConverters._

val y: mutable.Buffer[String] =
  ListHasAsScala[String](SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    .getNativesForFlavor(DataFlavor.imageFlavor)).asScala

