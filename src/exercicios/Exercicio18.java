package exercicios;

//18 - Francisco tem 1,50m e cresce 2 centímetros por ano,
// enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
// Faça um algoritmo que calcule e imprima na tela em quantos
// anos serão necessários para que Sara seja maior que Francisco


public class Exercicio18 {

    public static void main(String[] args) {

        double alturaF = 1.5, alturaS = 1.1;

        int contador = 0;

        while(alturaF > alturaS){
            alturaF += 0.02;
            alturaS += 0.03;
            contador++;
        }

        System.out.println(contador);

    }

}
