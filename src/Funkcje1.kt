import kotlin.math.log
import kotlin.math.log10

fun main(){
    val tab1 = arrayOf(1.0,100.0,100000.0,10.0,1000.0,1000000.0,1.0,0.0001,0.1)
    val logarytmy10 = tab1.map{ log10(it) }

    val log4 = log(16.0,4.0)

    println(logarytmy10)
}