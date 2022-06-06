package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    // método estático onde consigo invocar via classe , não via instancia
    companion object {
        fun imprimeRelatorio(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }


}