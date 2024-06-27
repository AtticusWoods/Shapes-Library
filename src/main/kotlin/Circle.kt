import kotlin.math.PI

open class Circle(private var center: Point, private var radius: Double) {
    // Getter for center
    fun getCenter(): Point {
        return center
    }

    // Getter for radius
    fun getRadius(): Double {
        return radius
    }

    // Get area
    fun getArea(): Double {
        return PI * radius * radius
    }

    // Move the point by deltaX and deltaY
    fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }
}