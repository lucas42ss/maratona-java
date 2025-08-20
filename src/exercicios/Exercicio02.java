package exercicios;

//2 - Faça um algoritmo para receber um número qualquer e imprimir
// na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sacanner = new Scanner(System.in);
        int num = sacanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Número Par");
            if (num >= 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }
        } else {
            System.out.println("Numero Ímpar");
            if (num >= 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }
        }

    }
}
