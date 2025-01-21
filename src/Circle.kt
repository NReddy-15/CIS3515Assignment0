class Circle : Shape("Circle") {

    var radius = 0

    fun setDimensions(_radius : Int) {
        this.radius = _radius
    }

    override fun printDimensions() {
        println("Radius: $radius")
    }

    override fun getArea(): Double {
        return Math.PI*radius*radius
    }
}