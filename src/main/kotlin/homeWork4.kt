import kotlin.math.pow

fun main() {
    val pi: Float = 3.14F
    println("Please enter the radius of a circle: ")
    var r: Float = readLine()!!.toFloat()

    while (r <= 0) {
        println("The radius of the circle must be more than 0. Please try again: ")
        var r: Float = readLine()!!.toFloat()

        if (r>0){
            println ("The area of the circle is: ${pi*(r.pow(2))}")
            println ("The circumference of the circle is: ${pi*(r*2)}")
            println ("The diameter of the circle is: ${r*2}")
            break

        }

    }


}