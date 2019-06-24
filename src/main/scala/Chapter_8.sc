class Person(val name: String, val salary: Double) {
  def this() {
    this("LALA", 12)
  }

  def this(x: String) {
    this(x, 11)
  }
}

new Person()

class Employee(name: String, override val salary: Double) extends Person {
  def this() {
    this("A", 11)
  }
}

val alien: {def greeting: String} = new Person("Fred") {
  def greeting = "greeting"
}

alien.greeting

//1
class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def currentBalance = balance

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var balance = initialBalance

  override def deposit(amount: Double): Double = {
    balance += amount
    balance -= 1
    balance
  }

  override def withdraw(amount: Double) = {
    balance -= amount
    balance -= 1
    balance
  }
}

val account = new CheckingAccount(100)
println(account.deposit(10))

//2
class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var balance = initialBalance
  private var deals = 0

  def earnMonthlyInterest(rate: Double) = {
    deals = 0
    balance *= rate
    balance
  }

  override def deposit(amount: Double): Double = {
    balance += amount
    if (deals > 3)
      balance -= 1
    balance
  }

  override def withdraw(amount: Double) = {
    balance -= amount
    if (deals > 3)
      balance -= 1
    balance
  }
}

//5
class Point(val x: Double, val y: Double)

class LabeledPoint(val label: String, override val x: Double, override val y: Double) extends Point(x, y) {
}

val labeledPoint = new LabeledPoint("name", 11, 13)
labeledPoint.asInstanceOf[Point].x


