import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.math.sqrt

class LineTest {

    @Test
    fun testGetLength() {
        val point1 = Point(1.0, 1.0)
        val point2 = Point(4.0, 5.0)
        val line = Line(point1, point2)
        assertEquals(sqrt(9.0 + 16.0), line.getLength())
    }

    @Test
    fun testMove() {
        val point1 = Point(1.0, 1.0)
        val point2 = Point(4.0, 5.0)
        val line = Line(point1, point2)
        line.move(2.0, -1.0)
        assertEquals(3.0, line.getPoint1().getX())
        assertEquals(0.0, line.getPoint1().getY())
        assertEquals(6.0, line.getPoint2().getX())
        assertEquals(4.0, line.getPoint2().getY())
    }

    @Test
    fun testGetSlope() {
        val point1 = Point(1.0, 1.0)
        val point2 = Point(3.0, 5.0)
        val line = Line(point1, point2)
        assertEquals(2.0, line.getSlope())
    }

    @Test
    fun testGetPoints() {
        val point1 = Point(1.0, 1.0)
        val point2 = Point(3.0, 5.0)
        val line = Line(point1, point2)
        assertEquals(point1, line.getPoint1())
        assertEquals(point2, line.getPoint2())
    }
}
