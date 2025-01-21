class Square(_name: String) : Shape(_name) {

    var length = 5.00
    fun setDimensions(_length : Double) {
        length = _length
    }

    override fun printDimensions() {
        println("Side length: $length")
    }

    override fun getArea(): Double {
        return length*length
    }
}