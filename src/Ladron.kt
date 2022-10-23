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


    //Esto lo uso para ordenar de mayor a menor entonces no tengo que comerme la cabez haciendo nada mas por que luego borro el objeto y el siguiente ya es el segundo con mayor ratio
    art.sortByDescending { it.ratio }


    //Estas dos variables las uso para la condicion del while una es para contar las veces que se hace que es el cont, y el tamañoOriginal es para sabe cuanto mide el arraylist
    var cont : Int = 0
    val tamanoOriginal : Int = art.size

    //Aqui en pesoactual<PESOMAX eso para que el bucle siga y no supere al peso maximo de la mochila
    while(pesoactual < PESOMAX && cont < tamanoOriginal){

        //Este if sirve para meter los objetos en la mochila y suma el peso de los objetos
        if((art[0].peso + pesoactual) < PESOMAX){
            mochila.add(art[0])
            pesoactual+= art[0].peso
        }


        //Aqui borro el primer objeto asi directamente el siguiente ya lo coge y asi todo el rato
        art.removeAt(0)
        cont++

    }




    println("Peso final de la mochila " + pesoactual)

    mochila.forEach{
        println(" valor:${it.valor},peso:${it.peso},ratio:${it.ratio}")
    }
}