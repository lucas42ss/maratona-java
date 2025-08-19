package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public String toString(){
        return "DEV | Nome: " + this.nome + " Salário: " + this.salario;
    }

    @Override
    public void calculaBonus(){};
}
