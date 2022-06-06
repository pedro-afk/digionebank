package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val gerente = Analista(nome = "Zeca Pagodinho", cpf = "123.123.123-12", salario = 23450.87)
    ImprimeRelatorioFuncionario.imprimeRelatorio(gerente)

}

