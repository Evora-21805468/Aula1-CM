fun main(args: Array<String>) {
    var listaNums = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var listaNomes = listOf<String?>("Gonçalo", "Bia", "Martim", "Catarina", "João")

    println(listaNums)
    listaNomes += null
    for (i in listaNums) {
        if (listaNums[i - 1] % 2 != 0) {
            println(listaNums[i - 1])
        }
    }

    listaNomes += null

    for ((index, value) in listaNomes.withIndex()) {
        if (value != null) {
            if (value.length > 4) {
                println("$index: ${cumprimentar(value)}, tudo bem?")
            } else {
                println("$index: ${cumprimentar(null)}, tudo bem?")
            }
        }
    }
}

fun cumprimentar(nomePessoa: String?): String {
    if (nomePessoa == null) {
        return "Olá Anónimo"
    }
    return "Olá $nomePessoa"
}
