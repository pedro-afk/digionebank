package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val analista = Analista(nome = "Pedro Daniel", cpf = "123.123.123-12", salario = 2450.87)
    ImprimeRelatorioFuncionario.imprimeRelatorio(analista)

    //val pedroFuncionario = Funcionario(nome = "Pedro Daniel", cpf = "123.123.123-12", salario = BigDecimal.valueOf(2450.94));
    //println(pedroFuncionario.nome);
    //println(pedroFuncionario.cpf);
    //println(pedroFuncionario.salario);
}


