package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Alice";
        estudante.idade = 27;
        estudante.sexo = 'F';
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.impressora(estudante);
    }

}
