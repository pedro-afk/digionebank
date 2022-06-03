package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Pedro"
    var cpf: String = "123.123.123.12"
}

fun main() {
    // instância da classe pessoa
    val pedro = Pessoa();

    println("${pedro.nome} ${pedro.cpf}")
}