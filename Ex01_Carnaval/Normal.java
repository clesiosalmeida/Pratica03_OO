package Ex01_Carnaval;

//2. Crie uma classe Normal , que herda os atributos da classe Ingresso
//💡 Palavra reservada para herança >> extends
public class Normal extends Ingresso{

    private static int count=0;

    public Normal(double valorIngresso) {
        super(valorIngresso); //💡 Super passa os atributos da classe mãe
        count++;
    
    }

    //Crie o método que imprime o valor do ingresso com a mensagem "Ingresso Normal".

    public String imprimeIngresso(){

        //valorIngresso=100;

        return "Ingresso Normal " + getValorIngresso();
    }

    public int numeroNor(){
        return count;
    }
    
        
}
