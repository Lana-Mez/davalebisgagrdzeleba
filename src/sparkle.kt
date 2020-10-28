internal class Fraction {
    var numerator: Int
    var denominator: Int

    constructor(n: Int, d: Int) {
        numerator = n
        denominator = d
        reduce()
    }

    constructor(d: Double) {
        val i:Int = ("" + d).split("\\.".toRegex()).toTypedArray()[1].length
        denominator = Math.pow(10.0, i.toDouble()).toInt()
        numerator = (d * denominator).toInt()
        reduce()
}

    private fun reduce() {
    var n: Int = numerator
    val d: Int = denominator
    val largest: Int
     if (numerator < 0){
         n= -numerator
     }
     largest = if (n > d){
         n
     }else{
         d
     }
     var gcd = 0
     for ( i: Int  in largest downTo 2 ){
         if (numerator % i == 0 && denominator % i == 0){
             gcd=i
             break
         }
     }
     if (gcd != 0) {
         numerator /= gcd
         denominator /= gcd

     }

    }
    override fun toString(): String {
        return "$numerator/$denominator"

    }

}
