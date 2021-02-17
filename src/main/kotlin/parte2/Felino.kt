package parte2

abstract class Felino (nome: String) : Animal(nome), Miar{
    abstract override fun miar(): String
}
