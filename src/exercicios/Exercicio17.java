package exercicios;

//17 - Faça um algoritmo que leia uma temperatura em
// Fahrenheit e calcule a temperatura correspondente em
// grau Celsius. Imprima na tela as duas temperaturas.
//
//Fórmula: C = (5 * ( F-32) / 9)

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double f = scanner.nextDouble(), c = 0;

        c = 5 * ((f-32)/9);

        System.out.println("Temperatura em Cº: " + c + " Temperatura em ºF: " + f);


    }

}
