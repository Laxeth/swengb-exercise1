import fh.joanneum.swengb.lab1.Canvas
import fh.joanneum.swengb.lab1.Circle
import fh.joanneum.swengb.lab1.Rectangle
import fh.joanneum.swengb.lab1.Shape

fun main() {
    println("Hello World!")

    val testShape = Shape()
    println(testShape.color) // black

    val testRectangle = Rectangle(width = 5.0, length = 2.0 )
    println(testRectangle.getArea()) // 10.0
    testRectangle.length // 2

    val testCircle = Circle(radius = 2.0 )
    println(testCircle.getArea())
    testCircle.radius

    val circle = Circle(radius = 10.0, color = "red")
    println(circle) //toString overridden
    println(testRectangle)
    println(testShape)


    val circle1 = Circle(radius = 10.0, color = "red")
    val circle2 = Circle(radius = 10.0, color = "red")

    //after overriding...
    println(circle1 === circle2) // false - checking referential integrity
    println(circle1 == circle2) // true - checking structural integrity
    println(setOf<Circle>(circle1, circle2).size) // 1 element in the set (because it is the same)

    val canvas = Canvas()
    canvas.addShape(Rectangle("white", width = 5.0, length = 2.0))
    canvas.addShape(Circle("red", radius = 1.0))
    println(canvas.getTotalArea()) //  13.14

    canvas.addShape(Rectangle("white", width = 5.0, length = 2.0))
    canvas.addShape(Circle("red", radius = 1.0))
    canvas.addShape(Rectangle("blue", width = 4.5, length = 4.0))
    println(canvas.shapesCountPerType())
}