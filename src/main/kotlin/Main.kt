fun main (args: Array<String>) {
    var listaNums = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    var listaNomes = listOf<String>("Gonçalo","Bia","Martim","Catarina","João")
    println(listaNums)

    for (i in listaNums){
        if(listaNums[i-1] %2 != 0){
            println(listaNums[i-1])
        }
    }

    for (j in listaNomes){
        cumprimentar(listaNomes[j])
    }

}

fun cumprimentar (nomePessoa: String): String {
    return "Olá $nomePessoa"
}
