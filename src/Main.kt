import java.util.*

fun main(){
    val tablica = arrayOf(1,5,7,10,5,4,10)
    val lista = arrayListOf(1,5,7,10,5,4,10)

    println(Arrays.toString(tablica))
    println(lista)

    lista.add(15)

    println(lista)

    for(index in 0..tablica.size-1)
        println("tablica[${index}]=${tablica[index]}")

}