open class Rectangle (private var point1: Point, private var point2: Point){

    init {
        val y = point1.getY() - point2.getY()
        val x = point1.getX() - point2.getX()

        if(x == 0.0 || y == 0.0){
            throw Exception("A rectangle cannot have 0 width or height")
        }
    }

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