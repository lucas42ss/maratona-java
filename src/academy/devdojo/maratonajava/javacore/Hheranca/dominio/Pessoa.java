package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected Endereco endereco;

    static {
        System.out.println("Bloco static da superclasse Pessoa");
    }

    {
        System.out.println("Bloco da superclasse Pessoa");
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Dentro do construtor pessoa");
    }

    public Pessoa(String nome, int idade, Endereco endereco) {
        this(nome, idade);
        this.endereco = endereco;
    }


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
