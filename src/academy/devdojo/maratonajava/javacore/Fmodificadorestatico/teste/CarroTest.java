package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.getVelocidadeMaxima();
        Carro carro1 = new Carro("Toyota");
        Carro carro2 = new Carro("Honda");
        Carro carro3 = new Carro("Nissan");

        carro1.imprime();

        Carro.setVelocidadeMaxima(350);

        carro2.imprime();

        Carro.setVelocidadeMaxima(280);

        carro1.imprime();



    }
}
