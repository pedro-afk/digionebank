package one.digitalinnovation.digionebank

import java.math.BigDecimal

// criando a classe conta já com um construtor primário
class Conta(
    val agencia: String,
    val numero: String,
    val saldo: BigDecimal,

) {
    // métodos
    fun deposito(valor: BigDecimal) {

    }

    fun saque(valor: BigDecimal) {
        
    }
}