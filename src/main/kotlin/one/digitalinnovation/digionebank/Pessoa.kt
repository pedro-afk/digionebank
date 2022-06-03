package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Pedro"
    var cpf: String = "123.123.123.12"

    // utilizando o private nos setters, evita que o valor dos atributos sejam alterados na execução da aplicação
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

    // opção para criar classe dentro de outra classe, ATENÇÃO (Isso é feito em casos específicos)
    // em outros casos, criaremos outra classe, depende muito da necessidade
    inner class Endereco {
        var rua: String = "Rua Teste"
    }
}

fun main() {
    // instância da classe pessoa
    val pedro = Pessoa();

    // referencia do meu objeto na memoria
    println(pedro)



    println("${pedro.nome} ${pedro.cpf} ${pedro.Endereco().rua}")
    println(pedro.pessoaInfo())

}