package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public void calcularImpostoTomate(Computador computador){
        double imposto = computador.valorImposto();
    }
    public void calcularImpostoTomate(Tomate tomate){
        double imposto = tomate.valorImposto();
    }
}
