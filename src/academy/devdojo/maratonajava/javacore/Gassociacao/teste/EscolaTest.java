package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Edva");
        Professor professor2 = new Professor("Geazy");
        Professor professor3 = new Professor("Damião");
        Escola escola = new Escola("Colégio Criativo");
        escola.imprime();

        escola.setProfessores(new Professor[]{professor1, professor2, professor3});
        escola.imprime();


    }
}
