package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Tomate";
        carro1.modelo = "Etios";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.nome = "Carrinho";
        carro2.modelo = "Terios";
        carro2.ano = 1998;

        //carro1 = carro2;

        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}
