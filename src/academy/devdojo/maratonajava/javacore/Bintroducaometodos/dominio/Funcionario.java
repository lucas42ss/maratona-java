package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public int[] salario = {0,0,0};

    public void mediaSalarial(this.salario) {
        int media = 0;

        for (int sal : salario) {
            media += sal;
        }

        System.out.println(media / salario.length);
    }

    public Funcionario(String nome, int idade, int[] salario) {
        nome = this.nome;
        idade = this.idade;
        salario = this.salario;
    }


}
