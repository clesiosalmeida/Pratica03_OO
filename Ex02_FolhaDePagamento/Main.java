
import javax.swing.JOptionPane;
//import javax.swing.JFrame; 👉 se tudo der certo arriscar criar uma janela contendo as informações; 
//import javax.swing.JCheckBox;//arriscar utilizar no Switch

public class Main {
    public static void main(String[] args) {
        //❗Objetivo: Cadastrar funcionarios de uma empresa e calcular os devidos proventos de cada um; 

        // Entrar com o os dados do funcionário, escolher tipo, mostrar o funcionário e calcular os proventos; 

        int matricula, producao, opcao;
        double valor,percentual, vendas, salario;
        String nome;

        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Funcionário Padrão \n2. Funcionário comissionado \n3. Funcionário Produtividade \n\nDigite [0] para sair","Tipo de Funcionário",JOptionPane.PLAIN_MESSAGE));
            
            switch (opcao) {
                
                case 1: 
                
                //1. Inputar valores pelo componente .showInputDialog do pacote .JOptionPane
                matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "nº Matricula: ","Dados do Funcionário",JOptionPane.PLAIN_MESSAGE)); 
                nome = JOptionPane.showInputDialog(null, "Nome: ", "Dados do Funcionário",JOptionPane.PLAIN_MESSAGE);
                salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario: ","Dados do Funcionáro",JOptionPane.PLAIN_MESSAGE));
                
                //2. Criar objeto da classe e instanciar a classe; 
                FPadrao funcionarioPadrao = new FPadrao(matricula, nome, salario);

                //3. Mostrar na tela, usando compenente .showMessageDialog do pacote .JOptionPane
                JOptionPane.showMessageDialog(null,"salario: "+ funcionarioPadrao.calcularProventos(), "Proventos", JOptionPane.DEFAULT_OPTION);

                
                break;

                case 2: 

                //1.
                matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "nº Matricula: ","Dados do Funcionário",JOptionPane.PLAIN_MESSAGE)); 
                nome = JOptionPane.showInputDialog(null, "Nome: ", "Dados do Funcionário",JOptionPane.PLAIN_MESSAGE);
                salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario: ","Dados do Funcionáro",JOptionPane.PLAIN_MESSAGE));
                vendas = Double.parseDouble(JOptionPane.showInputDialog(null, "valor em vendas: ","Dados de vendas",JOptionPane.PLAIN_MESSAGE));
                percentual = Double.parseDouble(JOptionPane.showInputDialog(null, "Comissão: ","Dados de vendas",JOptionPane.PLAIN_MESSAGE));
                
                //2.
                FComissionado funcionarioComissionado = new FComissionado(matricula, nome, salario, percentual, vendas);
                
                //3.
                JOptionPane.showMessageDialog(null, funcionarioComissionado.calcularProventos(), "Proventos", JOptionPane.DEFAULT_OPTION);
                
                break; 
                case 3: 
                
                //1.
                matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "nº Matricula: ","Dados do Funcionário",JOptionPane.PLAIN_MESSAGE)); 
                nome = JOptionPane.showInputDialog(null, "Nome: ", "Dados do Funcionário",JOptionPane.PLAIN_MESSAGE);
                salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario: ","Dados do Funcionáro",JOptionPane.PLAIN_MESSAGE));
                producao = Integer.parseInt(JOptionPane.showInputDialog(null, "Produção: ", "PPL", JOptionPane.PLAIN_MESSAGE));
                valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor por venda: ", "PPL", JOptionPane.PLAIN_MESSAGE));

                //2.
                FProdutividade funcionarioProdutividade = new FProdutividade(matricula, nome, salario, valor, producao);

                //3.
                JOptionPane.showMessageDialog(null, funcionarioProdutividade.calcularProventos(), "Proventos", JOptionPane.DEFAULT_OPTION);

                case 0:
                break;
                default:

                JOptionPane.showMessageDialog(null, "Escolha a opção correta", "Mensagem",JOptionPane.NO_OPTION);
                 
            }

        }while(opcao !=0);



        
    }
}
