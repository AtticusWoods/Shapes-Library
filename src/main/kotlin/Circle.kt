import kotlin.math.PI

class Circle(private var center: Point, private var radius: Double)  : Ellipse(center, radius, radius) {

    init {
        if(radius == 0.0) {
            throw Exception("An ellipse cannot have a radius of 0")
        }
    }

    // Getter for radius
    fun getRadius(): Double {
        return radius
    }

}