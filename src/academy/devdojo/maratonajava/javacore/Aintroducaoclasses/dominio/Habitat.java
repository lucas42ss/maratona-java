package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Habitat {
    private String nome;
    private String vegetacao;

    public Habitat(String nome, String vegetacao) {
        this.nome = nome;
        this.vegetacao = vegetacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVegetacao() {
        return vegetacao;
    }

    public void setVegetacao(String vegetacao) {
        this.vegetacao = vegetacao;
    }
}
