package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Manoel", 56, new int[]{2500, 3452, 5498});

        funcionario.mediaSalarial();
        funcionario.imprimeDados();

        funcionario.setSalario(new int[]{350, 55777, 2});

        funcionario.imprimeDados();
        funcionario.mediaSalarial();

        System.out.println(funcionario.getNome());

    }
}
