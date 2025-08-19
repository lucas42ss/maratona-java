package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double VALOR_IMPOSTO = 0.36;
    private String dataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double valorImposto(){
        return this.getValor()*VALOR_IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
