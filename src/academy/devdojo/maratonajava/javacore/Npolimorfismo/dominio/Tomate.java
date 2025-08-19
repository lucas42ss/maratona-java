package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double VALOR_IMPOSTO = 0.36;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double valorImposto(){
        return this.valor*VALOR_IMPOSTO;
    }
}
