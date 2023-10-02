package learning.scala

import learning.scala.CaseClassFeaturesTest.ScalaCalculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class CaseClassFeaturesTest {
  @Test def testCaseClassEquals() = {
    // Using default apply method of default companion object
    // (We will see that in class, no worries)
    val calculator1 = ScalaCalculator(5)
    val calculator2 = ScalaCalculator(5)
    assertEquals(calculator1, calculator2)
    val calculator3 = ScalaCalculator(6)
    assertNotEquals(calculator1, calculator3)
  }

  @Test def testCaseClassHashcode() = {
    val calculator1 = ScalaCalculator(5)
    val calculator2 = ScalaCalculator(5)
    assertEquals(calculator1.hashCode(), calculator2.hashCode())
    val calculator3 = ScalaCalculator(6)
    assertNotEquals(calculator1, calculator3)
  }

  @Test def testCaseClassGetter() = {
    val calculator = ScalaCalculator(3)
    assertEquals(3, calculator.value)
  }

  @Test def testConstructor() = {
    val calculator = new ScalaCalculator(0)
    assertEquals(0, calculator.value)
  }

  @Test def testToString() = {
    assertEquals("ScalaCalculator(4.0)", ScalaCalculator(4).toString)
  }
}

object CaseClassFeaturesTest {
  case class ScalaCalculator(value: Double)
}