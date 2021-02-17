package parte2

class Cao (nome: String) : Canideo(nome) {
    override fun latir(): String {
        return "$nome está a latir!"
    }
}
