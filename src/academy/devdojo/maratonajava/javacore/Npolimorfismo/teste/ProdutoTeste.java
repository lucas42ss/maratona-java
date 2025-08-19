package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("Eniac", 88.20);
        Tomate tomate = new Tomate("Salada", 50);


        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
