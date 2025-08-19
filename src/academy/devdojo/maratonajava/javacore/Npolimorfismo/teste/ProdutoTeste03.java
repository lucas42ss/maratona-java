package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Salada", 27);
        tomate.setDataValidade("30-08-1504");

        CalculadoraImposto.calcularImposto(tomate);

    }
}
