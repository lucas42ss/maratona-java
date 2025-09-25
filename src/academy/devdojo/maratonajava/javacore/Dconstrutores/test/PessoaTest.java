package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lucas", 27);
        pessoa.setEndereco("Rua Nova, 42");
        System.out.println(pessoa.getEndereco());
    }
}
