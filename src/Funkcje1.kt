import java.util.*
import kotlin.math.log
import kotlin.math.log10

fun main(){
    val tab1 = arrayOf(1.0,100.0,100000.0,10.0,1000.0,1000000.0,1.0,0.0001,0.1)
    val kwadraty = tab1.map{ log10(it) }

    println(kwadraty)
}