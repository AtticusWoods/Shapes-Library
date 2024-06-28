open class Square(private var point1: Point, private var point2: Point) : Rectangle(point1, point2) {

    init {
        val y = point1.getY() - point2.getY()
        val x = point1.getX() - point2.getX()

        if(x != y){
            throw Exception("A square must have equal width and height")
        }
    }

}