import kotlin.math.sqrt

open class Triangle : Shape("Triangle") {

    var side1 = 0
    var side2 = 0
    var side3 = 0

    fun setDimensions(_side1 : Int, _side2 : Int, _side3 : Int) {
        this.side1 = _side1
        this.side2 = _side2
        this.side3 = _side3
    }

    override fun printDimensions() {
        println("Side 1 length: $side1")
        println("Side 2 length: $side2")
        println("Side 3 length: $side3")
    }

    override fun getArea(): Double {
        val halfPerimeter = (side1 + side2 + side3)/2
        return sqrt((halfPerimeter*(halfPerimeter-side1)*(halfPerimeter-side2)*(halfPerimeter-side3)).toDouble())
    }
}