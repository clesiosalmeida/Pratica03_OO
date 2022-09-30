package Ex01_Carnaval;


//1. Crie uma classe chamada Ingresso que possui um valor em reais.

public class Ingresso {

    //Crie o construtor dessa classe e os métodos Set e Get
    protected double valorIngresso;

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public Ingresso(double valorIngresso) {
        super();
        this.valorIngresso = valorIngresso;

    }


    
    
}
