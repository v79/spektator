package org.liamjd.spek.calc

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.context
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

object CalculatorSpekTest: Spek({
	describe("a calculator") {
		val calculator = CalculatorKotlin()
		context("addition") {
			val sum = calculator.add(5,4)
			it("5 plus 4 should equal 9") {
				assertEquals(9,sum)
			}
		}
		context("deletion") {
			val diff = calculator.subtract(10,5)
			it("10 minus 5 should equal 5") {
				assertEquals(5,diff)
			}
		}
	}
})
