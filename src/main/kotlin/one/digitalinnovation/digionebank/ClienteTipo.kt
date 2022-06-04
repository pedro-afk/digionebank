package one.digitalinnovation.digionebank

enum class ClienteTipo(val descricao: String) {
    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");

    // opcao de criar funcoes estáticas, acessadas via classe, não via instancia do objeto
    companion object {
        fun exibeDescricao() = println("${ClienteTipo.PF.descricao} ${ClienteTipo.PJ.descricao}")
    }

}