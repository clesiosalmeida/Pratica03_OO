package Ex01_Carnaval;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        /*mostrar as opções : (1) Ingresso Normal (2) VIP e (3) Camarote . Cada opção deverá instanciar o seu respectivo construtor e chamar o respectivo método de impressão. Solicite a entrada de dados pelo teclado através do scanner ou showMessageDialog*/
        int opcao;
        double valor, valorAdicional;
        String localizacao;
        

        //💡 Usando o Integer e o Parseint()... converte de String para int. classe e convertedor
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Ingresso NOrmal \n <2> Ingresso VIP \n <3> Ingresso Camarote \n <0> Sair")); 
        

            switch (opcao) {
            case 1: valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));//💡Usando classe Double e o convertedor ParseDouble();
            Normal ingressoNormal = new Normal(valor);//💡Cria um objeto da classe Normal e instancia; 
            System.out.println(ingressoNormal.imprimeIngresso());  

            //showMessageDiaglod(null, "texto", "titulo", JOptionPane.OPTIONS)
            JOptionPane.showMessageDialog(null, ingressoNormal.imprimeIngresso(),"Mensagem",JOptionPane.NO_OPTION);
                break;
            
            case 2: valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
            valorAdicional=Double.parseDouble(JOptionPane.showInputDialog("Valor dicional "));
            VIP ingressoVIP = new VIP(valor, valorAdicional);
                

            System.out.println(ingressoVIP.imprimeIngresso());
            JOptionPane.showMessageDialog(null, ingressoVIP.imprimeIngresso(),"Mensagem",JOptionPane.NO_OPTION);
                break;
            case 3: valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
            valorAdicional=Double.parseDouble(JOptionPane.showInputDialog("Valor dicional "));
            localizacao = JOptionPane.showInputDialog("Localização: ");
            
            Camarote ingressoCamarote = new Camarote (valor, valorAdicional, localizacao);
            JOptionPane.showMessageDialog(null, ingressoCamarote.imprimeIngresso(),"Mensagem",JOptionPane.NO_OPTION);
                break;
            case 0: 
                break; 
                
            default: 
            JOptionPane.showMessageDialog(null, "Escolha a opção correta", "Mensagem",JOptionPane.NO_OPTION);

        }
    } while (opcao != 0);
        


    }
}
