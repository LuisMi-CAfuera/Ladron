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

    constructor(valor: Int, peso: Int) {
        this.valor = valor
        this.peso = peso
    }
    constructor(){

    }
}


//Valor entre peso

fun main(){

    var mochila = Personaje()
    var art = arrayOf(Objetos(30,3),Objetos(20,7),Objetos(20,3),Objetos(50,4),Objetos(30,8))
    var art2 : ArrayList<Float> = arrayListOf<Float>()


    art.forEach {
        art2.add( (it.valor/it.peso).toFloat())
    }


    art2.forEach{
        println(it)
    }



}





fun Distribuir(art2 : ArrayList<Double>,art : Array<Objetos>,mochila : Personaje){
    var cont = 0
    val PESOMAX = 10

    art2.forEach{
        for (p in art2) {
            if(it >= p && (art[cont].peso + mochila.mochila) <= PESOMAX){

            }
        }
    }
}