import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.math.PI

class CircleTest {

    @Test
    fun testMove() {
        val center = Point(0.0, 0.0)
        val radius1 = 5.0
        val circle = Circle(center, radius1)
        circle.move(2.0, -1.0)
        assertEquals(2.0, circle.getCenter().getX())
        assertEquals(-1.0, circle.getCenter().getY())
    }

    @Test
    fun testGetPoints() {
        val center = Point(0.0, 0.0)
        val radius1 = 5.0
        val square = Circle(center, radius1)
        circle.move(2.0, -1.0)
        assertEquals(center, circle.getCenter())
    }

    @Test
    fun testArea() {
        val center = Point(0.0, 0.0)
        val radius1 = 5.0
        val square = Circle(center, radius1)
        assertEquals(PI * radius1 * radius1, square.getArea())

    }
}