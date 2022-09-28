package Ex01_Carnaval;

//3. Crie o método que imprime o valor do ingresso com a mensagem "Ingresso Normal".

public class VIP extends Ingresso{


    public double valorAdicional;

    //Crie o construtor dessa classe com o valor do ingresso

    public VIP(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    //Crie um método que imprime o valor do ingresso com o adicional incluído e a mensagem "Ingresso VIP".

    public String imprimeIngresso(){
        return "Ingresso VIP " + (getValorIngresso()+ getValorAdicional());//💡 gets entre () para o compilador entende que é uma operação matemática
    } //💡 posso ter metodos com o mesmo nom em classes diferentes
    
}
