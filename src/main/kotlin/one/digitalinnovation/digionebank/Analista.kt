package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Analista(
    nome: String,
    cpf: String,
    salario: Double):
    Funcionario(nome, cpf, salario) {

    override fun calcAuxilio(): Double = salario * 0.1
}