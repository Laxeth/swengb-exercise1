package fh.joanneum.swengb.lab1

open class Shape(val color:String = "black") {
    open fun getArea():Double {
        return 0.0
    }

    override fun toString(): String {
        return "Circle(color=$color)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Shape

        if (color != other.color) return false

        return true
    }

    override fun hashCode(): Int {
        return color.hashCode()
    }
}

class Rectangle(color:String = "black", val width:Double = 1.0, val length:Double = 1.0): Shape(color){
    override fun getArea(): Double {   // make use of smart completion in IntelliJ (Alt+Enter), Ctrl+Space
        return width * length
    }

    override fun toString(): String {
        return "Circle(width=$width, length=$length, color=$color)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        if (!super.equals(other)) return false

        other as Rectangle

        if (width != other.width) return false
        if (length != other.length) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + width.hashCode()
        result = 31 * result + length.hashCode()
        return result
    }


}

class Circle(color:String = "black", val radius:Double = 1.0): Shape(color){
    override fun getArea(): Double {
        return (Math.PI * radius * radius)
    }

    override fun toString(): String {
        return "Circle(radius=$radius, color=$color)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        if (!super.equals(other)) return false

        other as Circle

        if (radius != other.radius) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + radius.hashCode()
        return result
    }


}