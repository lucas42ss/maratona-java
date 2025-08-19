package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto {
    public static final double VALOR_IMPOSTO = 0.15;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double valorImposto(){
        return this.valor*VALOR_IMPOSTO;
    }
}
