package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_MAXIMA = 350;
    public static final int CILINDROS;
    public final int VALVULAS;

    public final Comprador comprador = new Comprador();

    static{
        CILINDROS = 4;
    }

    public Carro(){
        this.VALVULAS = 12;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public final void imprime(){
        System.out.println(this.getNome());
    }

}
