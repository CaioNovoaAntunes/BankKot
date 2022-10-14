class Funcionario(nome: String, numero: Int, validade: Int, salario: Double, var senha: String, var email: String) : Pessoa(nome, numero, validade,
    salario
), PlrCalc {



    override fun calculaSalario(outroSalario:Double) = if (outroSalario <= 0.0){
        println("Não pode fazer isso")
    }else{
    salario += outroSalario
    }

    override fun calcPlr(salario: Double) {
       val plrFuncionario:Double = 0.30
      this.salario += this.salario * plrFuncionario
    }
}