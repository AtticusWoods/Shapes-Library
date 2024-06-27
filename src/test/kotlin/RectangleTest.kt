import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class RectangleTest {

    @Test
    fun testMove() {
        val point1 = Point(1.0, 1.0)
        val point2 = Point(4.0, 1.0)
        val point3 = Point(4.0, 8.0)
        val point4 = Point(1.0, 8.0)
        val rectangle = Rectangle(point1, point2, point3, point4)
        rectangle.move(2.0, -1.0)
        assertEquals(3.0, rectangle.getPoint1().getX())
        assertEquals(0.0, rectangle.getPoint1().getY())

        assertEquals(6.0, rectangle.getPoint2().getX())
        assertEquals(0.0, rectangle.getPoint2().getY())

        assertEquals(6.0, rectangle.getPoint3().getX())
        assertEquals(7.0, rectangle.getPoint3().getY())

        assertEquals(3.0, rectangle.getPoint3().getX())
        assertEquals(7.0, rectangle.getPoint3().getY())
    }

    @Test
    fun testGetPoints() {
        val point1 = Point(1.0, 1.0)
        val point2 = Point(4.0, 1.0)
        val point3 = Point(4.0, 8.0)
        val point4 = Point(1.0, 8.0)
        val rectangle = Rectangle(point1, point2, point3, point4)
        assertEquals(point1, rectangle.getPoint1())
        assertEquals(point2, rectangle.getPoint2())
        assertEquals(point3, rectangle.getPoint3())
    }

    @Test
    fun testArea() {
        val point1 = Point(1.0, 1.0)
        val point2 = Point(4.0, 1.0)
        val point3 = Point(4.0, 8.0)
        val point4 = Point(1.0, 8.0)
        val rectangle = Rectangle(point1, point2, point3, point4)
        assertEquals(21.0, rectangle.getArea())

    }
}