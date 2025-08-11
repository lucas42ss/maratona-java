package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class ProfessorExercicio {
    private String nome;
    private String especialidade;
    private SeminarioExercicio[] seminarios = new SeminarioExercicio[]{};

    public ProfessorExercicio(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public ProfessorExercicio(String nome, String especialidade, SeminarioExercicio[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSeminarios(SeminarioExercicio[] seminarios) {
        this.seminarios = seminarios;
    }
}
