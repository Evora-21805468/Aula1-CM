package parte2

class Falcao (nome: String) : Ave(nome){
    override fun voar(): String {
        return "$nome está a voar!"
    }
}
