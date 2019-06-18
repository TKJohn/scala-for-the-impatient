class Person(var name: String, val age: Int) {}

val a = new Person("a", 11)

//7
class Person2(val name: String) {
  private val t = name.split(" ")
  val firstName = t(0)
  val lastName = t(1)
}

new Person2("Tom Smith").name
new Person2("Tom Smith").firstName
new Person2("Tom Smith").lastName

//10
class Employee(val name: String, var salary: Double) {
  def this() {
    this("John Q. Public", 0.0)
  }
}

new Employee().name
new Employee().salary

class Employee2(val name: String = "John Q. Public", var salary: Double = 0.0) {
}

new Employee2().name
new Employee2().salary
