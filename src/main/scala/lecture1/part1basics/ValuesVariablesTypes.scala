package lecture1.part1basics

object ValuesVariablesTypes extends App {
  //  Constant (Immutable)

  val aConstantValue: Int = 42
  println(aConstantValue)

  val aString: String = "A sample string"
  println(aString)

  val aBoolean: Boolean = true
  println(aBoolean)

  val aChar: Char = 'a'
  println(aChar)

  val anInt: Int = aConstantValue
  println(anInt)

  val aShort: Short = 1234
  println(aShort)

  val aLong: Long = 1097348102983740L
  println(aLong)

  val aFloat: Float = 2.0f
  println(aFloat)

  val aDouble: Double = 3.1416433409582f
  println(aDouble)


//  Variable is same, but are mutable (Can be changed)
  var aVariable: Int = 50
  println(aVariable)
}
