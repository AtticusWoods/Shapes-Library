import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.math.PI

class CircleTest {

    @Test
    fun testMove() {
        val center = Point(0.0, 0.0)
        val radius = 5.0
        val circle = Circle(center, radius)
        circle.move(2.0, -1.0)
        assertEquals(2.0, circle.getCenter().getX())
        assertEquals(-1.0, circle.getCenter().getY())
    }

    @Test
    fun testGetPoints() {
        val center = Point(0.0, 0.0)
        val radius = 5.0
        val circle = Circle(center, radius)
        circle.move(2.0, -1.0)
        assertEquals(center, circle.getCenter())
    }

    @Test
    fun testArea() {
        val center = Point(0.0, 0.0)
        val radius = 5.0
        val circle = Circle(center, radius)
        assertEquals(PI * radius * radius, circle.getArea())

    }

    @Test
    fun testRadius() {
        val center = Point(0.0, 0.0)
        val radius = 5.0
        val circle = Circle(center, radius)
        assertEquals(radius, circle.getRadius())

    }

    @Test
    fun testRadiusNot0() {
        val center = Point(0.0, 0.0)
        val radius = 0.0
        val exception = assertThrows<Exception> {
            val circle = Circle(center, radius)
        }
        assertEquals("An ellipse cannot have a radius of 0", exception.message)
    }
}