data class Point(private var x: Double, private var y: Double) {

    // Getter for x attribute
    fun getX(): Double {
        return x
    }

    // Getter for y attribute
    fun getY(): Double {
        return y
    }

    // Clone the point
    fun clone(): Point {
        return copy()
    }

    // Move the point by deltaX and deltaY
    fun move(deltaX: Double, deltaY: Double) {
        x += deltaX
        y += deltaY
    }
}
