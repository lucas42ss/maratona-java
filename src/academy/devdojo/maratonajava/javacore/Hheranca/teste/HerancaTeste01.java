package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args){
        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua da Aurora");
        endereco1.setCep("5503-220");

        Pessoa pessoa1 = new Pessoa("Alice Guimarães", 27);
        pessoa1.setEndereco(endereco1);

        pessoa1.imprime();

        Funcionario funcionario = new Funcionario("Emanoel Silva", 27, 3300);
        funcionario.setEndereco(endereco1);
        System.out.println("------------");
        funcionario.imprime();

        System.out.println("------------");
        funcionario.relatorio();
    }
}
