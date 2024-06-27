import kotlin.math.PI

open class Ellipse(private val center: Point, private val radiusX: Double, private val radiusY: Double){

    // Getter for center
    fun getCenter(): Point {
        return center
    }

    // Getter for xRadius
    fun getRadiusX(): Double {
        return radiusX
    }

    // Getter for yRadius
    fun getRadiusY(): Double {
        return radiusY
    }

    // Calculate the area of the ellipse
    fun getArea(): Double {
        return PI * radiusX * radiusY
    }

    // Move the point by deltaX and deltaY
    fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }
}
