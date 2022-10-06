

fun main(){

   val caio = Funcionario("Caio", 12381, 2022-2-30, 200.20,"123", "caio@caio")

   caio.calculaSalario(00.00)
   println(caio.salario)


   caio.calcPlr(caio.salario)

   println(caio.salario)

   val logaUsuario:LogaUsuario = LogaUsuario(caio)

   logaUsuario.logarComoPessoa("caio@cai", "123")
   }


