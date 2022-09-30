public class FPadrao extends Funcionario{
    
    //lembrar do uso do extends
    public FPadrao(int matricula, String nome, double salario) {
        super(matricula, nome, salario);// herda classe mãe
    }

    public double calcularProventos(){ 
        return getSalario();
    } 
}
