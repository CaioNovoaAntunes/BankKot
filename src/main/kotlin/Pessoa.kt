abstract class Pessoa(val nome:String, val numero: Int, val validade: Int, var salario: Double){

    open fun calculaSalario(outroSalario:Double) {}


}
