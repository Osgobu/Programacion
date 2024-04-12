fun mostrarMenu() {
    println("|| Menu ||")
    println("1.Afegiu Viatge")
    println("2.Consultar viatge")
    println("3.Detalls viatge")
    println("4.Registrar Client")
    println("5.Fer reserva")
    println("6.Detalls reserva")

}

fun leerOpcio() Int {
    print("Selecciona una opcion")
    val opcion:Int =readLine()!!.toIntorNull()!!

    return opcio 
}

fun afegirViatge(viatges: MutableList<Map<String,Double>>){
    print("Destinacio de viatge?")
    val destinacio: String = readLine() !!
    print("Introdueix el preu del viatge")
    val preu: Double = readLine()?.toDoubleOrNull() ?: 0.0
    val viatge: Dictrionary = Map<String,Double> = map0f (destinacio to preu)
    viatges.add(viatge)
}

fun ConsultarViatge(viatges: MuatbleList<Map<String, Double>>){
    println("Llista de viatges:")
    viatges.forEach{ viatge ->
        viatge.forEach {(destinacio,preu) ->
            println("Destinacio: ${destinacio}, Preu: ${preu}")
        }
    }
}

fun demanrDestinacio(): String{
    print("Introdueix el desti: ")
    val destinacio: string = readLine()!!

    return
}

fun detallsViatges(viatge: MutableList<Map<String,Double>>){
    destinacio = demanarDestinacio
    val viatge = viatges.find{it.keys.find{ it == destinacio} != null}
    if(viatges != null)
        println("Detalls del viatge: ")
        viatge.forEach{ (desti,preu)}->
            println("-Destinacio-${destinacio}")
            println("-Preu- $(preu)")
}

fun registrarClient(client: MutableList<Pair<String<Int,String>>){
    print("Introdueix el nom del client:")
    val nom:String readLine() ?: ""
    var id: Int = client.size +1
}

fun execturarOpcio(opcio: Int, viatges: MutableList<Map<String,Double>>){
    when(opcio){
        1 -> afegirViatge(viatges)
        2 -> ConsultarViatge(viatges)
        3 -> detallsViatges(viatges)
        4 -> registrarClient 
        7 -> println("Soritr de l'aplicacio")
        else -> println("Opcio no valida")
    }
}


fun main() {
    var viatges: MutableList<Map<String,Double>> =MutableList(0)
    client: MutableList<Pair<String<Int,String>> = mutableLIstOf
    mostrarMenu()
    val opcio=leerOpcio
    println(opcio)
    execturarOpcio(opcio)
}