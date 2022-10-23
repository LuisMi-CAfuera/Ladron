import jdk.incubator.vector.DoubleVector

class Personaje{
    var nombre = "Pepito"
    var mochila : Double = 10.0
    var perfil = "Ladron"


    constructor(){

    }

    constructor(nombre: String, mochila: Double, perfil: String) {
        this.nombre = nombre
        this.mochila = mochila
        this.perfil = perfil
    }
}
class Objetos{
    var valor : Int = 0
    var peso : Int = 0
    var ratio : Double = 0.0

    constructor(valor: Int, peso: Int) {
        this.valor = valor
        this.peso = peso
    }
    constructor(){

    }
}


//Valor entre peso

fun main(){

    var ladron = Personaje("Jack",10.0,"ladron")
    var art = arrayOf(Objetos(30,3),Objetos(20,7),Objetos(20,3),Objetos(50,10),Objetos(30,8))



    Distribuir(art,ladron)

}



fun Distribuir(art : ArrayList<Objetos>,ladron : Personaje){
    var pesoactual = 0
    val PESOMAX = ladron.mochila
    var mochila = arrayListOf<Objetos>()

    art.sortByDescending { it.ratio }

    var cont : Int = 0
    val tamanoOriginal : Int = art.size
    while(pesoactual < PESOMAX && cont < tamanoOriginal){

        if((art[0].peso + pesoactual) < PESOMAX){
            mochila.add(art[0])
            pesoactual+= art[0].peso
        }

        art.removeAt(0)
        cont++

    }




    println("Peso final de la mochila" + pesoactual)

    mochila.forEach{
        println("${it.valor},${it.peso},${it.ratio}")
    }
}