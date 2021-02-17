package parte2

class Gato (nome: String) : Felino(nome){
    override fun miar(): String {
        return "$nome está a miar!"
    }
}
