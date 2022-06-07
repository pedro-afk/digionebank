package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.ClienteTipo
import one.digitalinnovation.digionebank.Logavel
import one.digitalinnovation.digionebank.Pessoa

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "senha321" == senha

    override fun toString(): String = """
        Nome: $nome 
        CPF: $cpf 
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()
}