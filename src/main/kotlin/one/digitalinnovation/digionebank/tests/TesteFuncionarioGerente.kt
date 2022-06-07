package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {
    val gerente = Gerente(nome = "Zeca Pagodinho", cpf = "123.123.123-12", salario = 23450.87, senha = "senha123")
    ImprimeRelatorioFuncionario.imprimeRelatorio(gerente)

    TesteAutenticacao().autentica(gerente)
}

