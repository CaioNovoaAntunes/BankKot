 class LogaUsuario(var pessoa: Funcionario) : Login {


     override fun logarComoPessoa(usuario: String, senha: String) {
         if (pessoa.email != usuario || pessoa.senha != senha){
             println("deu ruim")
         }else{
             println("deu bom")
         }





 }
 }