package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private int[] salario = {0, 0, 0};

    public void mediaSalarial() {
        int media = 0;
        for (int sal : this.salario) {
            media += sal;
        }
        System.out.println(media / this.salario.length);
    }

    public void imprimeDados() {
        String salarioString = new String("");
        for (int sal : this.salario) {
            salarioString += sal + " ";
        }
        System.out.println("Nome: " + nome + " Idade: " + idade + " Salario: " + salarioString);
    }

    public Funcionario(String nome, int idade, int[] salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setSalario(int[] salario){
        this.salario = salario;
    }
}
