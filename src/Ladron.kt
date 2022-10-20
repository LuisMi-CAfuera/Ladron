class Mochila{
    var pesoMax : Int = 10

    constructor(pesoMax: Int) {
        this.pesoMax = pesoMax
    }
    constructor(){

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

    var mochila : ArrayList<Mochila> = arrayListOf<Mochila>()
    var art = arrayOf(Objetos(30,3),Objetos(20,7),Objetos(20,3),Objetos(50,4),Objetos(30,8))
    var art2 : ArrayList<Float> = arrayListOf<Float>()
    var cont = 0

    art.forEach {
        art2[cont]= (it.valor/it.peso).toFloat()
        cont++
    }


    art2.forEach{
        print(it)
    }

}