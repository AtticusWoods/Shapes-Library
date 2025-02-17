import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows

class SquareTest {

    @Test
    fun testMove() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(4.0, 4.0)
        val square = Square(point1, point2)
        square.move(2.0, -1.0)
        assertEquals(2.0, square.getPoint1().getX())
        assertEquals(-1.0, square.getPoint1().getY())

        assertEquals(6.0, square.getPoint2().getX())
        assertEquals(3.0, square.getPoint2().getY())

    }

    @Test
    fun testGetPoints() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(4.0, 4.0)
        val square = Square(point1, point2)
        assertEquals(point1, square.getPoint1())
        assertEquals(point2, square.getPoint2())
    }

    @Test
    fun testArea() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(4.0, 4.0)
        val square = Square(point1, point2)
        assertEquals(16.0, square.getArea())

    }

    @Test
    fun testTrueSquare() {
        val point1 = Point(1.0, 1.0)
        val point2 = Point(2.0, 3.0)
        val exception = assertThrows<Exception> {
            val square = Square(point1, point2)
        }
        assertEquals("A square must have equal width and height", exception.message)
    }

    @Test
    fun testWidthHeight() {
        val point1 = Point(1.0, 1.0)
        val point2 = Point(1.0, 1.0)
        val exception = assertThrows<Exception> {
            val square = Square(point1, point2)
        }
        assertEquals("A rectangle cannot have 0 width or height", exception.message)
    }

}
