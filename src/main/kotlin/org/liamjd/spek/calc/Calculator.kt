package org.liamjd.spek.calc

class CalculatorKotlin {
	fun add(a: Int, b: Int): Int {
		return a + b
	}

	fun subtract(a: Int, b: Int): Int {
		return a - b
	}
}

fun main(args: Array<String>) {
	val calc = CalculatorKotlin()

	println("---------")
	println("Adding 2 and 5, you get: " + calc.add(2, 5))
	println("Substracting 4 from 10, you get: " + calc.subtract(10, 4))
	println("---------")
}