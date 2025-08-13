package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Bloco static da subclasse Funcionário");
    }

    {
        System.out.println("Bloco da subclasse subclasse Funcionário");
    }

    public Funcionario(String nome, int idade){
        super(nome, idade);
    }
    public Funcionario(String nome, int idade, double salario){
        this(nome, idade);
        this.salario = salario;
        System.out.println("Dentro do construtor funcionario com salario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }
    public void relatorio(){
        System.out.println("O salário de " + this.getNome() + " é " + this.getSalario());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
