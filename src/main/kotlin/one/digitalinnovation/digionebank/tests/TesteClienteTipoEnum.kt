package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {

    println("ForEach com parametro")
    ClienteTipo.values().forEach { element ->
        println("${element.name} - ${element.descricao}")
    }

    // ou

    println("ForEach com it == this")
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    // ou

    println("for")
    for (element in ClienteTipo.values()) {
        println("${element.name} - ${element.descricao}")
    }

    println("Chamando funcao que exibe a descricao")
    // chamando funcao estatica via classe
    ClienteTipo.exibeDescricao()
}