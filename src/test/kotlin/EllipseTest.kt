import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.math.PI

class EllipseTest {
    @Test
    fun testMove() {
        val center = Point(0.0, 0.0)
        val radius1 = 5.0
        val radius2 = 4.0
        val ellipse = Ellipse(center, radius1, radius2)
        ellipse.move(2.0, -1.0)
        assertEquals(2.0, ellipse.getCenter().getX())
        assertEquals(-1.0, ellipse.getCenter().getY())
    }

    @Test
    fun testGetPoints() {
        val center = Point(0.0, 0.0)
        val radius1 = 5.0
        val radius2 = 4.0
        val ellipse = Ellipse(center, radius1, radius2)
        ellipse.move(2.0, -1.0)
        assertEquals(center, ellipse.getCenter())
    }

    @Test
    fun testArea() {
        val center = Point(0.0, 0.0)
        val radius1 = 5.0
        val radius2 = 4.0
        val square = Ellipse(center, radius1, radius2)
        assertEquals(PI * radius1 * radius2, square.getArea())
    }

    @Test
    fun testRadiusX() {
        val center = Point(0.0, 0.0)
        val radius1 = 5.0
        val radius2 = 4.0
        val ellipse = Ellipse(center, radius1, radius2)
        assertEquals(radius1, ellipse.getRadiusX())

    }

    @Test
    fun testRadiusY() {
        val center = Point(0.0, 0.0)
        val radius1 = 5.0
        val radius2 = 4.0
        val ellipse = Ellipse(center, radius1, radius2)
        assertEquals(radius2, ellipse.getRadiusY())

    }

    @Test
    fun testRadiusNot0() {
        val center = Point(0.0, 0.0)
        val radius1 = 0.0
        val radius2 = 4.0
        val exception = assertThrows<Exception> {
            val ellipse = Ellipse(center, radius1, radius2)
        }
        assertEquals("An ellipse cannot have a radius of 0", exception.message)
    }
}
