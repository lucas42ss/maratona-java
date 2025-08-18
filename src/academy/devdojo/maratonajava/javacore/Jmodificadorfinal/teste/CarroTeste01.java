package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.teste;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Etios");
        Comprador comprador1 = new Comprador();
        comprador1.setNome("Salazar");

        carro.comprador.setNome(comprador1.getNome());

        System.out.println(carro.comprador.getNome());
    }
}
