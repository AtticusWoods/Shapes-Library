import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class SquareTest {

    @Test
    fun testMove() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(4.0, 0.0)
        val point3 = Point(4.0, 4.0)
        val point4 = Point(0.0, 4.0)
        val square = Square(point1, point2, point3, point4)
        square.move(2.0, -1.0)
        assertEquals(2.0, square.getPoint1().getX())
        assertEquals(-1.0, square.getPoint1().getY())

        assertEquals(6.0, square.getPoint2().getX())
        assertEquals(-1.0, square.getPoint2().getY())

        assertEquals(6.0, square.getPoint3().getX())
        assertEquals(3.0, square.getPoint3().getY())

        assertEquals(2.0, square.getPoint3().getX())
        assertEquals(3.0, square.getPoint3().getY())
    }

    @Test
    fun testGetPoints() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(4.0, 0.0)
        val point3 = Point(4.0, 4.0)
        val point4 = Point(0.0, 4.0)
        val square = Square(point1, point2, point3, point4)
        assertEquals(point1, square.getPoint1())
        assertEquals(point2, square.getPoint2())
        assertEquals(point3, square.getPoint3())
    }

    @Test
    fun testArea() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(4.0, 0.0)
        val point3 = Point(4.0, 4.0)
        val point4 = Point(0.0, 4.0)
        val square = Square(point1, point2, point3, point4)
        assertEquals(16.0, square.getArea())

    }

//    @Test
//    fun testTrueSquare() {
//        val point1 = Point(0.0, 0.0)
//        val point2 = Point(4.0, 0.0)
//        val point3 = Point(4.0, 4.0)
//        val point4 = Point(0.0, 4.0)
//        val square = Square(point1, point2, point3, point4)
//        assertEquals(true, )
//    }

}
