class Square : Shape("Square") {

    var length = 0

    fun setDimensions(_length : Int) {
        this.length = _length
    }

    override fun printDimensions() {
        println("Side length: $length")
    }

    override fun getArea(): Double {
        return (length*length.toDouble())
    }
}