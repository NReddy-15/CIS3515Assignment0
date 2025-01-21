import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Triangle(_name) {

    var allSides = 5.00
    fun setDimensions(_length : Double) {
        allSides = _length
    }

    override fun printDimensions() {
        println("Side length: $allSides")
    }

    override fun getArea(): Double {
        val halfPerimeter = (allSides*3)/2
        val calc = Math.pow(halfPerimeter-allSides, 3.0)
        return sqrt(halfPerimeter*calc)
    }
}