package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val antonio = Cliente(
        nome = "Antonio",
        cpf = "123.123.123.12",
        clienteTipo = ClienteTipo.PF,
        senha = "senha321"
    )

    println(antonio)

    TesteAutenticacao().autentica(antonio)
}