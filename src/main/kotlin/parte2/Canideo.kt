package parte2

abstract class Canideo (nome: String) : Animal(nome), Latir{
    abstract override fun latir(): String
}
