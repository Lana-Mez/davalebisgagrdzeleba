fun main() {

    val coordinate = Point()

    coordinate.absis=4F
    coordinate.ordinate=3F

    println(coordinate.toString())
    println(coordinate.absis == coordinate.ordinate)

    val info = Triangle(height = coordinate.ordinate , base = coordinate.absis)
    println(info.getArea())


}

interface IFigure {
    fun getArea(): Float
}

class Point {

    var absis: Float = 4F
    var ordinate: Float = 8F

    override fun equals(other: Any?): Boolean {
        if(other is Point)
            if (this.absis == this.ordinate){
                return true
            }
        return false
    }
    override fun toString(): String {
        return "x=${absis} , y=${ordinate}"
    }

}
class Triangle(private val height: Float , private val base: Float): IFigure{
    override fun getArea(): Float{
        return height*base/2
    }
}





