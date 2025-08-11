package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class AlunoExercicio {
    private String nome;
    private int idade;
    private SeminarioExercicio seminario;

    public AlunoExercicio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public AlunoExercicio(String nome, int idade, SeminarioExercicio seminario) {
        this(nome, idade);
        this.seminario = seminario;
    }

    public String getNome() {
        return this.nome;
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

    public String getSeminario() {
        return this.seminario.getTitulo();
    }

    public void setSeminario(SeminarioExercicio seminario) {
        this.seminario = seminario;
    }
}
