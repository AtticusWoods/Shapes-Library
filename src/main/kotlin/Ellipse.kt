import kotlin.math.PI

class Ellipse(center: Point, private val radiusX: Double, private val radiusY: Double) : Circle(center, 0.0) {

    // Getter for xRadius
    fun getXRadius(): Double {
        return radiusX
    }

    // Getter for yRadius
    fun getYRadius(): Double {
        return radiusY
    }

    // Calculate the area of the ellipse
    override fun getArea(): Double {
        return PI * radiusX * radiusY
    }
}
