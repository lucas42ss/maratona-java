package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class SeminarioExercicio {
    private String titulo;
    private AlunoExercicio alunos[] = new AlunoExercicio[]{};
    private LocalExercicio local;

    public SeminarioExercicio(String titulo, LocalExercicio local) {
        this.titulo = titulo;
        this.local = local;
    }

    public SeminarioExercicio(String titulo, LocalExercicio local, AlunoExercicio[] alunos) {
        this(titulo, local);
        this.alunos = alunos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setAlunos(AlunoExercicio[] alunos) {
        this.alunos = alunos;
    }

    public AlunoExercicio[] getAlunos() {
        return alunos;
    }

    public void imprimeAlunos() {
        for (AlunoExercicio aluno : this.alunos) {
            System.out.println(aluno.getNome());
        }
    }
}
