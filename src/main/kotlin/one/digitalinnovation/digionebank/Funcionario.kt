package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    nome:String,
    cpf:String,
    val salario:Double
): Pessoa(nome, cpf) {
    // somente classes pais e filhas poderao usar o membro (protected)
    protected abstract fun calcAuxilio(): Double;

    override fun toString(): String = """
        Nome: $nome 
        CPF: $cpf 
        Salario: $salario
        Auxilio: ${calcAuxilio()}
    """.trimIndent()
}