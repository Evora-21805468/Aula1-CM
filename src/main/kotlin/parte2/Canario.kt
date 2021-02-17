package parte2

class Canario (nome: String) : Ave(nome) {
    override fun voar(): String {
        return "$nome está a voar!"
    }
}
