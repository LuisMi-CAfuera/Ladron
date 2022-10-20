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
    var ratio : Double = (valor/peso).toDouble()

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





fun Distribuir(art : Array<Objetos>,ladron : Personaje){
    var pesoactual = 0
    val PESOMAX = ladron.mochila
    var mochila = ArrayList<Objetos>()
    var mayorratio : Objetos
    var cont=0

    while(pesoactual < ladron.mochila){

        mayorratio = art.

        if((art[cont].peso + pesoactual) < PESOMAX){
            mochila.add(art[])

        }

    }




    println("Peso final de la mochila" + ladron.mochila)
}