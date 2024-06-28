import kotlin.math.PI
import kotlin.math.abs

open class Ellipse(private val center: Point, private val radiusX: Double, private val radiusY: Double){

    init {
        if(radiusX == 0.0 || radiusY == 0.0) {
            throw Exception("An ellipse cannot have a radius of 0")
        }
    }

    // Getter for center
    fun getCenter(): Point {
        return center
    }

    // Getter for xRadius
    fun getRadiusX(): Double {
        return abs(radiusX)
    }

    // Getter for yRadius
    fun getRadiusY(): Double {
        return abs(radiusY)
    }

    // Calculate the area of the ellipse
    fun getArea(): Double {
        return abs(PI * radiusX * radiusY)
    }

    // Move the point by deltaX and deltaY
    fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }
}
