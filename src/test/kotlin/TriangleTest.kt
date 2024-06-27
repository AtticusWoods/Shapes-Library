import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class TriangleTest {

    @Test
    fun testMove() {
        val point1 = Point(1.0, 1.0)
        val point2 = Point(4.0, 5.0)
        val point3 = Point(6.0, 8.0)
        val triangle = Triangle(point1, point2, point3)
        triangle.move(2.0, -1.0)
        assertEquals(3.0, triangle.getPoint1().getX())
        assertEquals(0.0, triangle.getPoint1().getY())
        assertEquals(6.0, triangle.getPoint2().getX())
        assertEquals(4.0, triangle.getPoint2().getY())
        assertEquals(8.0, triangle.getPoint3().getX())
        assertEquals(7.0, triangle.getPoint3().getY())
    }

    @Test
    fun testGetPoints() {
        val point1 = Point(1.0, 1.0)
        val point2 = Point(4.0, 5.0)
        val point3 = Point(6.0, 8.0)
        val triangle = Triangle(point1, point2, point3)
        assertEquals(point1, triangle.getPoint1())
        assertEquals(point2, triangle.getPoint2())
        assertEquals(point3, triangle.getPoint3())
    }
}
