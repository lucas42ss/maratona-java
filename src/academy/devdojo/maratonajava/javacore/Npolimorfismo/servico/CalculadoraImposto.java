package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Imposto do produto ");
        double imposto = produto.valorImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor do produto: " + produto.getValor());
        System.out.println("Valor do imposto do produto: " + imposto);
        if(produto instanceof Tomate){
            //((Tomate)produto).getDataValidade();
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

    }
}
