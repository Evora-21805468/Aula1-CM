package parte2

abstract class Ave(nome: String) : Animal(nome), Voar{
    abstract override fun voar(): String
}
