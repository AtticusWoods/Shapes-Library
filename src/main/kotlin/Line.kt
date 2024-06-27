import kotlin.math.sqrt

class Line(private var point1: Point, private var point2: Point) {

    fun getPoint1(): Point {
        return point1
    }

    fun getPoint2(): Point {
        return point2
    }

    fun getSlope(): Double {
        val rise = point1.getY() - point2.getY()
        val run = point1.getX() - point2.getX()
        return rise/run
    }

    fun getLength(): Double {
        val y = point1.getY() - point2.getY()
        val x = point1.getX() - point2.getX()
        return sqrt((x*x) + (y*y))
    }

    // Move the line by deltaX and deltaY
    fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
    }
}