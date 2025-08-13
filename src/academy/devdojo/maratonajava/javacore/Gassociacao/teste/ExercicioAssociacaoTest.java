package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.AlunoExercicio;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.LocalExercicio;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ProfessorExercicio;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.SeminarioExercicio;

public class ExercicioAssociacaoTest {
    public static void main(String[] args) {
        AlunoExercicio aluno1 = new AlunoExercicio("Alice Guimarães", 27);
        AlunoExercicio aluno2 = new AlunoExercicio("Lucas Miranda", 27);
        AlunoExercicio aluno3 = new AlunoExercicio("Marcos Miranda", 27);
        AlunoExercicio aluno4 = new AlunoExercicio("Felipe Fernandes", 27);
        LocalExercicio local1 = new LocalExercicio("Rua Itabaiana 235 A - Bloco C");
        ProfessorExercicio professor = new ProfessorExercicio("Lamano", "Sumiço");
        SeminarioExercicio seminario1 = new SeminarioExercicio("A verdade sobre todas as plantas", local1);
        SeminarioExercicio seminario2 = new SeminarioExercicio("A verdade sobre todas as pedras", local1);

        seminario1.setAlunos(new AlunoExercicio[]{aluno1, aluno2, aluno3, aluno4});

        professor.setSeminarios(new SeminarioExercicio[]{seminario1});

        for(AlunoExercicio aluno:seminario1.getAlunos()){
            System.out.println(aluno.getSeminario());
        }
    }
}
