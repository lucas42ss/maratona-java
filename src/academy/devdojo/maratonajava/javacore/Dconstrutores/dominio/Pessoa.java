package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;


    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(String nome, int idade, String endereco){
        this(nome, idade);
        this.endereco = endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
