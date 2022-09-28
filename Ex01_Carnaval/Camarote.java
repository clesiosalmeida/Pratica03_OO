package Ex01_Carnaval;

//4. Crie uma classe Camarote , que herda Ingresso e possui a localização do camarote e um valor adicional.
public class Camarote extends Ingresso{
    private double valorAdicional;
    private String localizacao;
    
    
    //Crieo construtor dessa classe com o valor do ingresso, valoradicional e localização do camarote

    public Camarote(double valorIngresso, double valorAdicional, String localizacao) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    } 

    
    
    public double getValorAdicional() {
        return valorAdicional;
    }



    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }



    public String getLocalizacao() {
        return localizacao;
    }



    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    //Crie um método que imprime o valor do ingresso com o adicional incluído, a localização do camarote e a mensagem "Ingresso Camarote No

    public String imprimeIngresso(){
        return "Ingresso Camarote " + (getValorIngresso()+getValorAdicional())+" "+getLocalizacao(); 
    }    




    
}
