package parte2

class Lobo (nome: String) : Canideo(nome) {
    override fun latir(): String {
        return "$nome está a latir!"
    }
}
