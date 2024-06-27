import kotlin.math.abs

class Triangle (private var point1: Point, private var point2: Point, private var point3: Point) {

    fun getArea(): Double {
        // Using the Shoelace formula to calculate the area
        return abs(point1.getX() * (point2.getY() - point3.getY()) +
                point2.getX() * (point3.getY() - point1.getY()) +
                point3.getX() * (point1.getY() - point2.getY())) / 2.0
    }

    fun getPoint1(): Point {
        return point1
    }

    fun getPoint2(): Point {
        return point2
    }

    fun getPoint3(): Point {
        return point3
    }
    fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
        point3.move(deltaX, deltaY)
    }
}