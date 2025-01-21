class Circle(_name: String) : Shape(_name) {

    var radius = 5.00
    fun setDimensions(_radius : Double) {
        radius = _radius
    }

    override fun printDimensions() {
        println("Radius: $radius")
    }

    override fun getArea(): Double {
        return Math.PI*radius*radius
    }
}