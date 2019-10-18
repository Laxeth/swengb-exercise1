package fh.joanneum.swengb.lab1

class Canvas(){
    private var shapes = mutableListOf<Shape>()

    fun addShape(shape: Shape){
        shapes.add(shape)
    }
    fun getTotalArea(): Double{
        return shapes.sumByDouble {obj -> obj.getArea()}
    }

    fun shapesCountPerType():Map<String, Int> {
        var recCount = 0
        var cirCount = 0
        for (Shape in shapes)
        {
            if (Shape.javaClass.simpleName == "Rectangle") {
                recCount += 1
            }
            else{
                cirCount += 1
            }
        }
        return mapOf("Rectangle" to recCount, "Circle" to cirCount)
    }
}

