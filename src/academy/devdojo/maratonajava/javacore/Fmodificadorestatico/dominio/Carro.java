package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {

    private String marca = new String();
    private static int velocidadeMaxima;

    public Carro(String marca){
        this.marca = marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    public static void setVelocidadeMaxima(int velocidadeMaxima){
        Carro.velocidadeMaxima = velocidadeMaxima;
    }
    public static int getVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public void imprime(){
        System.out.println(this.marca);
        System.out.println(Carro.velocidadeMaxima);
    }
}
