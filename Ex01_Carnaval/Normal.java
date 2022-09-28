package Ex01_Carnaval;

//2. Crie uma classe Normal , que herda os atributos da classe Ingresso
//💡 Palavra reservada para herança >> extends
public class Normal extends Ingresso{

    public Normal(double valorIngresso) {
        super(valorIngresso); //💡 Super passa os atributos da classe mãe
    }

    //Crie o método que imprime o valor do ingresso com a mensagem "Ingresso Normal".

    public String imprimeIngresso(){
        return "Ingresso Normal " + getValorIngresso();
    }
    
        
}
