package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Renato";
        professor.idade = 50;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);

    }
}
