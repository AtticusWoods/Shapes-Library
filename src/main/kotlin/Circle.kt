import kotlin.math.PI

class Circle(private var center: Point, private var radius: Double)  : Ellipse(center, radius, radius) {

    // Getter for radius
    fun getRadius(): Double {
        return radius
    }

}