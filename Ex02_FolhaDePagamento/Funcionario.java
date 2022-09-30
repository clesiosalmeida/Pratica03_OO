/**
 * Funcionario
 */
public abstract class Funcionario { //minha classe abstrata!🎨

    //🥪atributos
    private int matricula;
    private String nome;
    private double salario;
    
    //🛠️constructor
    public Funcionario(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    //🖐️ Getts and setters 

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public abstract double calcularProventos();//metodo abstrato 🎨

    @Override
    public String toString() {
        return "Funcionario [matricula=" + matricula + ", nome=" + nome + ", salario=" + salario + "]";
    }

    



}

