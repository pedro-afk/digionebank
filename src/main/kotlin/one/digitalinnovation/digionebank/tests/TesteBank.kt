package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Bank

fun main() {
    val digiOneBank = Bank(nome = "DigiOne", numero = 12)
    print(digiOneBank.nome)
    print(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")
    println(banco2.info())

}