open class Rectangle (private var point1: Point, private var point2: Point){

    open fun getArea(): Double {
        val y = point1.getY() - point2.getY()
        val x = point1.getX() - point2.getX()
        return x * y
    }

    open fun getPoint1(): Point {
        return point1
    }

    open fun getPoint2(): Point {
        return point2
    }

    fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
    }
}