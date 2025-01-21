//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Create objects
    val square: Shape = Square()
    val circle: Shape = Circle()
    val triangle: Shape = Triangle()
    val equilateralTriangle: Shape = EquilateralTriangle()

    //Prompt user for lengths and set dimensions
    println("Enter square side length: ")
    val squareSide = readln().toInt()
    (square as Square).setDimensions(squareSide)

    println("Enter circle radius length: ")
    val circleRadius = readln().toInt()
    (circle as Circle).setDimensions(circleRadius)

    println("Enter first triangle side length: ")
    val triangleSide1 = readln().toInt()
    println("Enter second triangle side length: ")
    val triangleSide2 = readln().toInt()
    println("Enter third triangle side length: ")
    val triangleSide3 = readln().toInt()
    (triangle as Triangle).setDimensions(triangleSide1, triangleSide2, triangleSide3)

    println("Enter equilateral triangle side length: ")
    val eqTriangleSide = readln().toInt()
    (equilateralTriangle as EquilateralTriangle).setDimensions(eqTriangleSide)

    //Print name, dimensions, and area for each object
    //Square
    println("Shape Name: " + square.name)
    square.printDimensions()
    println("Area: " + square.getArea())
    println()

    //Circle
    println("Shape Name: " + circle.name)
    circle.printDimensions()
    println("Area: " + circle.getArea())
    println()

    //Triangle
    println("Shape Name: " + triangle.name)
    triangle.printDimensions()
    println("Area: " + triangle.getArea())
    println()

    //Equilateral Triangle
    println("Shape Name: " + equilateralTriangle.name)
    equilateralTriangle.printDimensions()
    println("Area: " + equilateralTriangle.getArea())
    println()
}