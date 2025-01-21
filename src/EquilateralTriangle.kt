import kotlin.math.sqrt

class EquilateralTriangle : Shape("Equilateral Triangle") {

    var allSides = 0
    fun setDimensions(_length : Int) {
        this.allSides = _length
    }

    override fun printDimensions() {
        println("Side length: $allSides")
    }

    override fun getArea(): Double {
        val halfPerimeter = (allSides*3)/2
        val calc = Math.pow((halfPerimeter-allSides).toDouble(), 3.0)
        return sqrt(halfPerimeter*calc)
    }
}