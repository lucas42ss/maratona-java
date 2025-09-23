package exercicios;

//20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] Arg) {
        Scanner next = new Scanner(System.in);

        int num = next.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num*i);
        }
    }
}
