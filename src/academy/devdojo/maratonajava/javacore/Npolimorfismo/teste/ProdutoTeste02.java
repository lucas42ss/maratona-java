package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 5", 882);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());

        Produto produto2 = new Tomate("Cereja", 87);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());

    }
}
